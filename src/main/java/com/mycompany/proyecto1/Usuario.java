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
public class Usuario {
    String nombre;
    int relacion;
    ListaSimple relaciones = new ListaSimple();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRelacion() {
        return relacion;
    }

    public void setRelacion(int relacion) {
        this.relacion = relacion;
    }

    public ListaSimple getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(ListaSimple relaciones) {
        this.relaciones = relaciones;
    }
    
    
}
