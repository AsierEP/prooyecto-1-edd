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
public class ListaSimple<T> {
    private Nodo<T> pFirst;
    private Nodo<T> pLast;
    private int size;
    
    public ListaSimple(){
        this.pFirst = null;
        this.pLast = null; 
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.pFirst == null;
    }    
    
    public void AddStart(T data){
        Nodo<T> nodo = new Nodo(data);
        
        
        
        if (this.isEmpty()){
            this.pFirst = nodo;
            this.pLast = nodo;
            
            
        }else{
            nodo.setpNext(this.pFirst);
            this.pFirst = nodo;
            
        }
        size ++;
        
    }
    
    public void AddEnd(T data){
        Nodo <T> nodo = new Nodo(data);
        
        if (this.isEmpty()){
            this.pFirst = nodo;
            this.pLast = nodo;
        
        }else{
            this.pLast.setpNext(nodo);
            this.pLast = nodo;
        }
        
        
        
    }
    
    public Nodo<T> BuscarInidice(int index){
        Nodo <T> pAux = this.pFirst;
        int count = 0;
        
        while(pAux != null && count != index){
            pAux = pAux.getpNext();
            count++;
            
            
        }
        if (pAux != null){
            return pAux;
        }else{
            return null;
        }
                
           
    }
    
    public void Print(){
        Nodo<T> pAux = this.pFirst;
        int count = 1;
        
        while (pAux != null){
            System.out.println("Posicion" + count + ": " + pAux.getData() );
            pAux = pAux.getpNext();
            count ++;
        }
    }

    public Nodo<T> getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo<T> pFirst) {
        this.pFirst = pFirst;
    }

    public Nodo<T> getpLast() {
        return pLast;
    }

    public void setpLast(Nodo<T> pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
}
