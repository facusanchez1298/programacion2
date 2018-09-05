package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    /*
    Lista lista = new Lista();
	Nodo a = new Nodo("facu");
	Nodo b = new Nodo("leo");
	Nodo c = new Nodo("gaston");
	Nodo d = new Nodo("pedro");

	lista.agregar(a);
	lista.agregar(b);
	lista.agregar(c);
	lista.agregar(d);


	lista.mostrar(1);
	lista.eliminarYMostrar(2);
*/
    Lista lista = new Lista();
    Scanner scan = new Scanner(System.in);
    System.out.println("ingrese 5 caracteres: ");
    int i = 0;
    while(i < 5) {
        System.out.print("ingrese el caracter numero " + (i + 1) + ": ");
        char caracter = scan.next().charAt(0);
        String valor = "" + caracter;
        Nodo a = new Nodo(valor);
        lista.agregar(a);
        i++;
    }

    lista.mostrarInvertido();
    }
}
