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
public class Grafo {
    private ListaSimple vertices;

    public Grafo() {
        this.vertices = new ListaSimple();
    }

    public ListaSimple getVertices() {
        return vertices;
    }

    public void setVertices(ListaSimple vertices) {
        this.vertices = vertices;
    }
     
    public boolean isEmpty(){
        return vertices.getSize() == 0;
    }
    
    public boolean verticeExiste(String nombre){
        if(isEmpty()){
            return false;
        }
        else{                      
            for (int i = 0; i < vertices.len(); i++) {
                Vertice verticeAuxiliar = (Vertice) vertices.get(i);
                if(verticeAuxiliar.getNombre().equals(nombre)){
                    return true;
                }
            }           
            return false;
        }
    }
    
    public boolean relacionExiste(String verticeA, String verticeB){
        if(isEmpty()){
            return false;
        }
        else{
            ListaSimple adyList = new ListaSimple();
            
            for (int i = 0; i < vertices.len(); i++) {
                Vertice verticeAuxiliar = (Vertice) vertices.get(i);
                if(verticeAuxiliar.getNombre().equals(verticeA)){
                    adyList = verticeAuxiliar.getRelaciones();
                }
            }
            
            if(adyList.isEmpty()){
                return false;
            }
            else{
                for (int i = 0; i < adyList.len(); i++) {
                    Arista relacionAux = (Arista) adyList.get(i);
                    String nombreA = relacionAux.getVerticeA().getNombre();
                    String nombreB = relacionAux.getVerticeB().getNombre();
                    
                    if(nombreA.equals(verticeA) && nombreB.equals(verticeB)){
                        return true;
                    }
                }
                return false;               
            }
        }
    }
    
    public void agregarVertice(String nombre){
        if(isEmpty()){
            Vertice newVertice = new Vertice(nombre);
            vertices.append(newVertice);
        }
        else{
            if(verticeExiste(nombre)){
                System.out.println("Error: vertice ya existente");
            }
            else{
                Vertice newVertice = new Vertice(nombre);
                vertices.append(newVertice);
            }
        }
    }
    
    public void agregarRelacion(String verticeA, String verticeB){
        if(isEmpty()){
            System.out.println("Error: grafo vacio");
        }
        else{
            if(relacionExiste(verticeA, verticeB)){
                System.out.println("Error: relacion ya existente");
            }
            else{
                for (int i = 0; i < vertices.len(); i++) {
                    Vertice verticeAux = (Vertice) vertices.get(i);
                    if(verticeAux.getNombre().equals(verticeA)){
                        ListaSimple adyList = verticeAux.getRelaciones();
                        Arista relacion = new Arista(verticeA, verticeB);
                        adyList.append(relacion);
                    }
                }
            }
        }
    }
      
    public void print(){
        if(isEmpty()){
            System.out.println("Error: grafo vacio");
        }
        else{
            for (int i = 0; i < vertices.len(); i++) {
                Vertice verticeAux = (Vertice) vertices.get(i);
                if(verticeAux.getRelaciones().isEmpty()){
                    System.out.println("El vertice " + verticeAux.getNombre() + " no apunta a nadie");
                }
                else{
                    ListaSimple adyList = verticeAux.getRelaciones();
                    for (int j = 0; j < adyList.len(); j++) {
                        Arista relacionesAux = (Arista) adyList.get(i);
                        String nombreA = relacionesAux.getVerticeA().getNombre();
                        String nombreB = relacionesAux.getVerticeB().getNombre();
                        System.out.println("El vertice " + nombreA + " apunta a " + nombreB);
                    }
                }
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    
    
    
    
}
