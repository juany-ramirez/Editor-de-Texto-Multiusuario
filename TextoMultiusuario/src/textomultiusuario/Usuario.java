/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textomultiusuario;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Usuario {
    int id;
    String user;
    String password;
    String nombre;
    String apellido;
    String correo;
    
    

    public Usuario(String user, String password, String nombre, String apellido, String correo) {
        this.user = user;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }    
    
    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
