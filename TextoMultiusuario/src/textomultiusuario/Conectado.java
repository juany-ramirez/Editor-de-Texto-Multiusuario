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
public class Conectado {
    boolean conectado;
    int bloque;

    public Conectado(){
    }
    
    public Conectado(boolean conectado, int bloque) {
        this.conectado = conectado;
        this.bloque = bloque;
    }
    
    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }
    
    
            
}
