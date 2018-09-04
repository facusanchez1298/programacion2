package com.company;

import java.util.ArrayList;

public class Greedy {

    public void greedy(int monto,  int[] monedas){
        int bandera = 1;
        int posicion = 0;
        ArrayList<Integer> solucion = new ArrayList<Integer>();
        while (bandera == 1){

            int masAlta = monedas[0];
            for(int i = 0; i < monedas.length; i++){
                if(masAlta < monedas[i]){
                    masAlta = monedas[i];
                   posicion = i;

                }

            }
            ordenarArreglo(monedas, posicion);
        }
    }

    public void ordenarArreglo(int[] monedas, int posicion){

        for (int i = posicion; i< monedas.length; i++){
            monedas[i] = monedas[i+1];
        }
    }
}
