/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;

    
/**
 *
 * @author User
 */
public class Grafo {
    Map<String, Nodo> nodos;
    
    
    public Grafo(){
        this.nodos = new HashMap<>();
    }
    
    public void AddEnlace(Usuario usuario1, Usuario usuario2){
        Nodo nodousuario1 = nodos.computeIfAbsent(usuario1.nombre,  i -> new Nodo(usuario1));
        Nodo nodousuario2 = nodos.computeIfAbsent(usuario2.nombre,  i -> new Nodo(usuario2));
        
        nodousuario1.setpNext(nodousuario2);
        nodousuario2.setpNext(nodousuario1);
    }
    
    
    
}
