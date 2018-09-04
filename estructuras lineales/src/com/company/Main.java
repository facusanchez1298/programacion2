package com.company;

public class Main {

    public static void main(String[] args) {
	Lista lista = new Lista();
	Nodo a = new Nodo("facu");
	Nodo b = new Nodo("leo");
	Nodo c = new Nodo("gaston");

	lista.agregar(a);
	lista.agregar(b);
	lista.agregar(c);

	lista.mostrar(2);

    }
}
