package com.company;

import java.util.Scanner;

public class Main {
Arbol arbol;
Nodo nodo;

    public static void main(String[] args) {
    Nodo nodo1 = new Nodo(1);
    Nodo nodo2 = new Nodo(2);
    Nodo nodo3 = new Nodo(3);
    Nodo nodo4 = new Nodo(4);
    Nodo nodo5 = new Nodo(5);
    Nodo nodo6 = new Nodo(6);

    Arbol arbol = new Arbol();

    arbol.agregarDato(nodo4);
    arbol.agregarDato(nodo2);
    arbol.agregarDato(nodo5);
    arbol.agregarDato(nodo1);
    arbol.agregarDato(nodo3);
    arbol.agregarDato(nodo6);



    System.out.println("agrupacion pre-orden:");
    arbol.preOrden(arbol.getRaiz());
    System.out.println("\n\nagrupacion post-orden:");
    arbol.postOrden(arbol.getRaiz());
    System.out.println("\n\nagrupacion in-orden:");
    arbol.inOrden(arbol.getRaiz());
    System.out.println("\n\nagrupacion por nivel: ");
    arbol.imprimirNivel();





}
}
