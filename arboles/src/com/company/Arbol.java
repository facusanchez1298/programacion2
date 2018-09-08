package com.company;

import java.util.Scanner;

public class Arbol {

    private Nodo raiz;

    public void agregarDato(Nodo nodo){
        if(this.raiz == null){
           this.raiz = nodo;
        }
        else{
            Nodo actual = raiz;
            boolean continuar = true;
            while(continuar) {
                if (actual.getDato() < nodo.getDato()) {
                    if (actual.getDer() != null) actual = actual.getDer();
                    else {
                        actual.setDer(nodo);
                        continuar = false;
                    }
                }
                else if (actual.getDato() > nodo.getDato()){
                    if (actual.getIzq() != null) actual = actual.getIzq();
                    else {
                        actual.setIzq(nodo);
                        continuar = false;
                    }
                }
            }
        }
    }

    public int pedirDato(){
        int dato;
        Scanner scan = new Scanner(System.in);
        System.out.print("ingrese un valor para el nodo");
        dato = scan.nextInt();
        return dato;
    }

   public void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.getDato() + "\t");
            preOrden(raiz.getIzq());
            preOrden(raiz.getDer());
        }
   }

    public void inOrden(Nodo raiz) {
        if (raiz != null) {
            preOrden(raiz.getIzq());
            System.out.print(raiz.getDato() + "\t");
            preOrden(raiz.getDer());
        }
    }

    public void postOrden(Nodo raiz) {
        if (raiz != null) {
            preOrden(raiz.getIzq());
            preOrden(raiz.getDer());
            System.out.print(raiz.getDato() + "\t");
        }
    }



    public Nodo getRaiz() {
        return raiz;
    }

}
