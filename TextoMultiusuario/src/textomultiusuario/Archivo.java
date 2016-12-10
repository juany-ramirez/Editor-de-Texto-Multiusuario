/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textomultiusuario;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

/**
 *
 * @author Juany
 */
public class Archivo {

    int ID;
    int user;
    String Nombre;
    ArrayList<Bloque> Contenido;
    String formato;
    String directorio;


    public Archivo() {
        this.Nombre = "";
        Contenido = new ArrayList<>();
    }

    public Archivo(int ID, int user, String Nombre, ArrayList<Bloque> Contenido, String formato, String directorio) {
        this.ID = ID;
        this.user = user;
        this.Nombre = Nombre;
        this.Contenido = Contenido;
        this.formato = formato;
        this.directorio = directorio;
    }
    
    
    
/*    public String GetFile(String filename) {
        /*String Respuesta = "";
        try {
            File file = new File(filename);
            this.Contenido = new byte[(int) file.length()];
            InputStream input = null;
            int totalBytesRead = 0;
            input = new BufferedInputStream(new FileInputStream(file));
            while (totalBytesRead < this.Contenido.length) {
                int bytesRemaining = this.Contenido.length - totalBytesRead;
                //input.read() returns -1, 0, or more :
                int bytesRead = input.read(this.Contenido, totalBytesRead, bytesRemaining);

                if (bytesRead > 0) {
                    totalBytesRead = totalBytesRead + bytesRead;
                }
            }
            for (int i = 0; i < this.Contenido.length; i++) {
                Respuesta += String.format("%8s", Integer.toBinaryString(this.Contenido[i] & 0xFF)).replace(' ', '0');
            }
            //Respuesta = "Archivo Leido Exitosamente";
        } catch (Exception ex) {
            Respuesta = "Error: " + ex.toString();
        }
        return Respuesta;
    }*/

    public String SerielizarXml(Archivo dir) {
        try {
            XStream xstream = new XStream(new DomDriver());
            xstream.alias("Archivo", Archivo.class);
            String xml = xstream.toXML(dir);
            return xml;
        } catch (Exception ex) {
            return "Error";
        }

    }

    public Archivo DeserielizarXml(String Serial) {
        try {
            XStream xstream = new XStream(new DomDriver());
            Archivo direc = (Archivo) xstream.fromXML(Serial);
            return direc;
        } catch (Exception ex) {
            return null;
        }
    }

    public Archivo ConsultaBD(String ID) {
        Conn cn = new Conn();                                         // Obtiene la conexion
        ResultSet rs = null;
        Statement stmt = null;
        String Err = "";
        int i = 0;
        /*Fin declaracion de variables*/
        try {
            /*Crear la conexion a la base de datos */
            cn.mkConnRe();
            if (cn == null) {
                Err = "Error de Conexion a la BD";
            } else {
                stmt = cn.conn.createStatement();
                rs = stmt.executeQuery("select ID, Nombre, Fecha, Directorio, Contenido \n"
                        + "FROM orgarc.archivos c \n"
                        + "where c.ID = '" + ID + "';");
                /*Carga los datos de la base de datos a las propiedades de la clase*/
                while (rs.next()) {
                    this.ID = rs.getInt("codigoID");
                    this.Nombre = rs.getString("codigoDepartamento");
                    /* Blob b = rs.getBlob("contenido"); 
                     this.Contenido = b.getBytes(1, b.length()); */
                    i++;
                }
                if (i == 0) {
                    Err = "Error la consulta no devolvio registros";
                } else {
                    Err = "Consulta de registro exitosa";
                }
            }
            return this;
        } catch (Exception ex) {
            Err = ex.toString();
            return this;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (cn.conn != null) {
                    cn.conn.close();
                }
            } catch (SQLException e) {
                Err = e.toString();
            }
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getContenido() {
        return Contenido;
    }
    
    public void addContenido(Bloque bloque) {
        this.Contenido.add(bloque);
    }
    
    public void actualizarContenido(int i, Bloque bloque) {
        Contenido.set(i, bloque);
        Contenido.remove((i+1));
    }

    public void setContenido(ArrayList Contenido) {
        this.Contenido = Contenido;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDirectorio() {
        return directorio;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }
    
    
}
