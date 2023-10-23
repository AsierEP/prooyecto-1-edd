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
public class ListaSimple {

    Nodo pFirst;
    Nodo pLast;
    int size;

    public ListaSimple() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.pFirst == null;
    }

    public void addUsuario(Usuario usuario) {
        Nodo nodo = new Nodo(usuario);
        if (isEmpty()) {
            pFirst = nodo;
            pLast = nodo;

        } else {
            nodo.setpNext(this.pFirst);
            this.pFirst = nodo;
        }
        size++;
        
    }
    
}
