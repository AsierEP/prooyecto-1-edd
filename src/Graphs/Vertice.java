/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphs;

/**
 *
 * @author User
 */
public class Vertice {
        private String nombre;
    private ListaSimple relaciones;
    private boolean visited;

    public Vertice(String nombre) {
        this.nombre = nombre;
        this.relaciones = new ListaSimple();
        this.visited=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaSimple getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(ListaSimple relaciones) {
        this.relaciones = relaciones;
    }
    
    
    
    
    

}
