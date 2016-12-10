/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textomultiusuario;

/**
 *
 * @author Admin
 */
public class Bloque {
    String contenido;
    boolean conectado;
    
    public Bloque() {
    }
    
    public Bloque(String contenido) {
        this.contenido = contenido;
    }

    public Bloque(String contenido, boolean conectado) {
        this.contenido = contenido;
        this.conectado = conectado;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    
    
}
