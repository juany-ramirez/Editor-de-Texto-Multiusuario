/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textomultiusuario;

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
 * @author Samsung
 */

@XmlRootElement(name = "Archivo")
public class Archivo {
 
    String ID;
    String Nombre;
    String Fecha;
    String Directorio;
    byte[] Contenido;
    ArrayList<Usuario> escritura;
    ArrayList<Usuario> lectura;
    ArrayList<Usuario> ambos;

    public Archivo() {
        this.ID = "";
        this.Nombre = "";
        this.Fecha = "";
        this.Directorio = "";
    }

    public Archivo(String ID, String Nombre, String Fecha, String Directorio) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Directorio = Directorio;
    }

    public String GetFile(String filename) {
        String Respuesta="";
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
               Respuesta  += String.format("%8s", Integer.toBinaryString(this.Contenido[i] & 0xFF)).replace(' ', '0');
            }
            //Respuesta = "Archivo Leido Exitosamente";
        } catch (Exception ex) {
            Respuesta = "Error: " + ex.toString();
        }
        return Respuesta;
    }

    public String SerielizarXml() {
        StringWriter writer = new StringWriter();
        JAXBContext context;
        try {
            context = JAXBContext.newInstance(Archivo.class);
            Marshaller m = context.createMarshaller();
            m.marshal(this, writer);
            return writer.toString();
        } catch (JAXBException ex) {
            return "Error";
        }

    }

    public Archivo DeserielizarXml(String Serial) {
        StringWriter writer = new StringWriter();
        Archivo A1 = new Archivo();
        JAXBContext context;
        try {
            context = JAXBContext.newInstance(Archivo.class);
            Unmarshaller m = context.createUnmarshaller();
            return (Archivo) m.unmarshal(new StringReader(Serial));
        } catch (JAXBException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return A1;
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
                    this.ID = rs.getString("codigoPais");
                    this.Nombre = rs.getString("codigoDepartamento");
                    this.Fecha = rs.getString("codigoCiudad");
                    this.Directorio = rs.getString("nemo");
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

    @XmlElement
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @XmlElement
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @XmlElement
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    @XmlElement
    public String getDirectorio() {
        return Directorio;
    }

    public void setDirectorio(String Directorio) {
        this.Directorio = Directorio;
    }

    @XmlElement
    public byte[] getContenido() {
        return Contenido;
    }

    public void setContenido(byte[] Contenido) {
        this.Contenido = Contenido;
    }
}
