/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textomultiusuario;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.String;

/**
 *
 * @author jvjimenez
 */
public class Conn {
     String IP;
     String Puerto;
     String BD;
     String Usuario;
     String Clave;
     public Connection conn;
     
     public Conn(){
          this.IP="";
          this.Puerto="";
          this.BD="";
          this.Usuario="";
          this.Clave=""; 
          this.conn = null;
     }
     public Connection mkConnRe() throws Exception {
                try{
                  /*Datos de la BD*/
                  this.IP      = "localhost";
                  this.Puerto  = "33066";
                  this.BD      = "orgarc";
                  this.Usuario = "root";
                  this.Clave   = "ClaveBD";
                  String driver = "com.mysql.jdbc.Driver";
                  String url = "jdbc:mysql://"+this.IP+":"+this.Puerto+"/"+this.BD+
                          "?noAccessToProcedureBodies=true&amp;zeroDateTimeBehavior=convertToNull";  
                  Class.forName(driver).newInstance();
		  this.conn = DriverManager.getConnection(url,this.Usuario,this.Clave);
                }catch(Exception e){
                  e.printStackTrace();
                }                                
           return this.conn;
        }
}
