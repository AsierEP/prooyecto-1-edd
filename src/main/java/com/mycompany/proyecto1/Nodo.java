/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

/**
 *
 * @author User
 */
public class Nodo {
    
    Usuario usuario;
    Nodo pNext;
    
    public Nodo(Usuario usuario){
        this.usuario = null;
        this.pNext = null;
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
    
    


}
