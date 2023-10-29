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
public class Arista {
        
    //Atributos
    private Vertice verticeA;
    private Vertice verticeB;

    public Arista(Vertice verticeA, Vertice verticeB) {
        this.verticeA = verticeA;
        this.verticeB = verticeB;
    }
    
    public Arista(String nombreVerticeA, String nombreVerticeB){
        Vertice verticeA = new Vertice(nombreVerticeA);
        Vertice verticeB = new Vertice(nombreVerticeB);
        this.verticeA = verticeA;
        this.verticeB = verticeB;
    }

    public Vertice getVerticeA() {
        return verticeA;
    }

    public void setVerticeA(Vertice verticeA) {
        this.verticeA = verticeA;
    }

    public Vertice getVerticeB() {
        return verticeB;
    }

    public void setVerticeB(Vertice verticeB) {
        this.verticeB = verticeB;
    }
    
    
    
    
}
