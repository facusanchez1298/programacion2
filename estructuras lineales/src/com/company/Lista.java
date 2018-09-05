package com.company;

public class Lista {
    private Nodo primero;

    public void agregar(Nodo a){
        if (this.primero == null){
            a.setIndice(1);
            this.primero = a;
        }
        else{
            Nodo actual = this.primero;
            actual.setIndice(0);
            while((actual.getSig() != null)&&(actual.getSig().getIndice()>actual.getIndice())){
                //mientras siguiente no sea nulo y el indice del sgte sea mayor
                actual = actual.getSig();
            }
            a.setPrev(actual); //creamos un puntero entre el nuevo nodo y el ex-ultimo || nuevo < anterior
            a.setIndice(actual.getIndice() + 1);//le damos un indice a el nuevo nodo
            actual.setSig(a); //hacemos un puntero al nuevo nodo ||  anterior > ultimo
            this.primero.setPrev(a); //un puntero entre el primero y el nuevo || primero > nuevo
            a.setSig(this.primero); //puntero entre nuevo y primero || nuevo > primero

        }
    }

    public void mostrarTodo(){
        if(this.primero == null){
            System.out.print("la lista es nula");
        }
        else {
            Nodo actual = primero;

            while(actual.getIndice() < actual.getSig().getIndice()){
                System.out.println(actual.toString());
                actual = actual.getSig();
            }
            System.out.println(actual.toString());

        }
    }

    public void mostrar(int indice){
        Nodo actual = primero;

        while(indice != actual.getIndice()){
            actual = actual.getSig();
        }

        System.out.print("el nombre del nodo es: " + actual.toString());
    }

    public void eliminarYMostrar(int indice){
        Nodo actual = this.primero;

        while (actual.getIndice() != indice){
            actual = actual.getSig();
        }

        if(actual.getPrev() != null){
            Nodo siguiente = actual.getSig();
            actual = actual.getPrev();

            actual.setSig(siguiente);
            siguiente.setPrev(actual);

            while(actual.getSig().getIndice() > actual.getIndice() + 1){
                actual.getSig().setIndice(actual.getSig().getIndice() - 1);
            }

            mostrarTodo();
        }
    }
    public void mostrarInvertido(){
        if(this.primero == null){
            System.out.print("la lista es nula");
        }
        else {
            Nodo actual = primero.getPrev();

            while(actual.getIndice() > actual.getPrev().getIndice()){
                System.out.println(actual.toString());
                actual = actual.getPrev();
            }
            System.out.println(actual.toString());

        }
    }
}
