package com.company;

import java.util.Scanner;

public class Arbol {

    private Nodo raiz;
    int altura = 0;
    String[] lista;

    Arbol(){

    }


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
        retornarAltura();
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

    public void imprimirNivel(){

        lista = new String[altura + 1];

        imprimirNivel(this.raiz, 0);
        for(int i = 0; i< lista.length; i++){
            System.out.println(lista[i] + " en el nivel " + i);
        }

    }

    private void imprimirNivel(Nodo nodo, int nivel){
        if(nodo != null){
            lista[nivel] = nodo.getDato() + " " + ((lista[nivel] != null)? lista[nivel]:"");
            imprimirNivel(nodo.getDer(),nivel + 1);
            imprimirNivel(nodo.getIzq(),nivel + 1);
        }
    }
    public void retornarAltura(){
        Nodo actual = raiz;
        retornarAltura(this.raiz, 0);

    }

    private void retornarAltura(Nodo raiz, int nivel){
        if(raiz !=  null){
            if(nivel > this.altura){
                this.altura = nivel;
            }
            retornarAltura(raiz.getDer(), nivel + 1);
            retornarAltura(raiz.getIzq(), nivel + 1);
        }

    }







    public Nodo getRaiz() {
        return raiz;
    }

}
