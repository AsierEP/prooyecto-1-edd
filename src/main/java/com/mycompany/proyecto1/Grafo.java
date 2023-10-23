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
    private ListaSimple[] listasAdyacencia;
    
    public Grafo(int usuarios){
        this.listasAdyacencia = new ListaSimple[usuarios];
        
    }
    public void addEnlace(int usuario1, int usuario2){
        if (listasAdyacencia[usuario1] == null){
            listasAdyacencia[usuario1] = new ListaSimple();
            
        }
        if (listasAdyacencia[usuario2] == null){
            listasAdyacencia[usuario2] = new ListaSimple();
    }
        
        listasAdyacencia[usuario1].addUsuario(new Usuario(String.valueOf(usuario2)));
        listasAdyacencia[usuario2].addUsuario(new Usuario(String.valueOf(usuario1)));
        
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    public Nodo(Usuario usuario){
        this.usuario = usuario;
        this.pNext = null;
    }
    
    
    public Grafo(){
        this.nodos = new HashMap<>();
    }
    
    public void AddEnlace(Usuario usuario1, Usuario usuario2){
        Nodo nodousuario1 = nodos.computeIfAbsent(usuario1.nombre,  i -> new Nodo(usuario1));
        Nodo nodousuario2 = nodos.computeIfAbsent(usuario2.nombre,  i -> new Nodo(usuario2));
        
        nodousuario1.setpNext(nodousuario2);
        nodousuario2.setpNext(nodousuario1);
    }
    
    */
    
}
