package com.company;

public class Lista {
    private Nodo primero;

    public void agregar(Nodo a){
        if (this.primero == null){
            this.primero = a;
        }
        else{
            int indice = 1;
            Nodo actual = this.primero;
            while(actual.getSig() != null){
                actual = actual.getSig();
                indice ++;
            }
            a.setIndice(indice); //le damos un indice al nuevo nodo
            actual.setSig(a); //hacemos un puntero al nuevo nodo
            a.setPrev(actual); //creamos un puntero entre el nuevo nodo y el ex-ultimo
            this.primero.setPrev(a); //un puntero entre el primero y el nuevo
            a.setSig(this.primero); //puntero entre nuevo y primero
        }
    }

    public void mostrarTodo(){
        if(this.primero == null){
            System.out.print("la lista es nula");
        }
        else {
            Nodo actual = primero;
            while(actual.getSig() != null){
                System.out.println(actual.toString());
                actual = actual.getSig();
            }
            System.out.print(actual.toString());
        }
    }

    public void mostrar(int indice){
        Nodo actual = primero;

        while(indice != actual.getIndice()){
            actual = actual.getSig();
        }

        System.out.print("el nombre del nodo es: " + actual.toString());
    }

}
