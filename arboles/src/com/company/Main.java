package com.company;

import java.util.Scanner;

public class Main {
public Nodo raiz;

    public static void main(String[] args) {
    Nodo raiz = new Nodo(pedirDato());
    crearArbol(raiz);
        System.out.println("Recorrido Preorden: ");
        preOrden(raiz);

    }

    public static void crearArbol(Nodo raiz){
        if(raiz == null){
            raiz.setDato(pedirDato());
        }
        else{
            int a = pedirDato();
            if (a < raiz.getDato()){
                raiz.setDer(new Nodo(a));
            }
            if(a > raiz.getDato()){
                raiz.setDer(new Nodo(a));
            }
        }


    }

    public static int pedirDato(){
        int dato;
        Scanner scan = new Scanner(System.in);
        System.out.print("ingrese un valor para el nodo");
        dato = scan.nextInt();
        return dato;
    }

    private static void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.getDato() + " - ");
            preOrden(raiz.getIzq());
            preOrden(raiz.getDer());
        }
    }


}
