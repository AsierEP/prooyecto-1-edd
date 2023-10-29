/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graphs;

/**
 *
 * @author esteb
 */
public class Stack <T> {
    
    private Node<T> pCima;
    private int size;

    public Stack() {
        this.pCima = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.pCima == null;
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        if (this.isEmpty()) {
            this.pCima = node;
        } else {
            node.setNext(this.pCima);
            this.pCima = node;
        }
        this.size++;
    }

    public Node<T> pop() {
        Node<T> node = this.pCima;
        if (!this.isEmpty()) {
            this.pCima = this.pCima.getNext();
            size--;
        }
        return node;
    }

    public void search(T data) {
        if (!this.isEmpty()) {
            Node<T> pAux = this.pop();
            T aux = pAux.getData();
            if (aux == data) {
                System.out.println("El dato existe");
            } else {
                this.search(data);
            }
            this.push(aux);
        } else {
            System.out.println("Elemento No Encontrado");
        }
    }

    public void submerge(T data) {
        if (!this.isEmpty()) {
            Node<T> pAux = this.pop();
            T aux = pAux.getData();
            this.submerge(data);
            this.push(aux);
        } else {
            this.push(data);
        }
    }

    public void reverse() {
        if (!this.isEmpty()) {
            Node<T> pAux = this.pop();
            T aux = pAux.getData();
            this.reverse();
            this.submerge(aux);
        }
    }

    public void print() {
        this.print("");

    }

    private void print(String string) {
        if (!this.isEmpty()) {
            Node<T> pAux = this.pop();
            T aux = pAux.getData();
            string += "(" + aux + ")->";
            this.print(string);
            this.push(aux);
        } else {
            System.out.println(string + "//");
        }
    }

    public Node<T> getpCima() {
        return pCima;
    }

    public void setpCima(Node<T> pCima) {
        this.pCima = pCima;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
