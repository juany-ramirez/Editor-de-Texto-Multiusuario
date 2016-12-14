/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textomultiusuario;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author Admin
 */

@XStreamAlias("Bloque")
public class Bloque {
    
    String contenido;
    boolean conectado;
    
    public Bloque() {
    }
    
    public Bloque(String contenido) {
        this.contenido = contenido;
        conectado = false;
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
