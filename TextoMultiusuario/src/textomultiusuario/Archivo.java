/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textomultiusuario;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
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
@XStreamAlias("Archivo")
public class Archivo {

    int ID;
    int user;
    String Nombre;
    ArrayList<Bloque> Contenido;
    String formato;
    String fecha;
    String xmlS;

    public Archivo() {
        this.Nombre = "";
        Contenido = new ArrayList<>();
    }
    
    public Archivo(int ID, int user, String Nombre, ArrayList<Bloque> Contenido, String formato, String fecha) {
        this.ID = ID;
        this.Contenido = Contenido;
        this.user = user;
        this.Nombre = Nombre;
        this.xmlS = xmlS;
        this.formato = formato;
        this.fecha = fecha;
    }

    public Archivo(int ID, int user, String Nombre, String xmlS, String formato, String directorio) {
        this.ID = ID;
        this.user = user;
        this.Nombre = Nombre;
        this.xmlS = xmlS;
        this.formato = formato;
    }
    
   
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
            xstream.alias("Archivo", Archivo.class);
            xstream.alias("Bloque", Bloque.class);            
            Archivo direc = (Archivo) xstream.fromXML(Serial);
            return direc;
        } catch (Exception ex) {
            return null;
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

    @Override
    public String toString() {
        return ID + ". " + Nombre;
    }
    
    
}
