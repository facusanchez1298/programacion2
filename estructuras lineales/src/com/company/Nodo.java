package com.company;

public class Nodo {
    private String nombre;



    private int indice = 0;
    private Nodo sig;
    private Nodo prev;

    Nodo(){

    }

    Nodo(int indice){
        this.indice = indice;
    }

    Nodo(String nombre){
        this.nombre = nombre;
    }

    public String toString() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    public int getIndice() {
        return this.indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
