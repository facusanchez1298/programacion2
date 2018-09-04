package com.company;/*package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int cantidadMonedas;
        int[] monedas;
        Greedy greedy = new Greedy();
        Scanner scan = new Scanner(System.in);
        int monto;

        System.out.print("ingrese la cantidad de monedas que posee: \n");
        cantidadMonedas = scan.nextInt();


            monedas = new int[cantidadMonedas];


        System.out.print("ingrese el valor de las monedas:\n");

        for(int i = 0; i<cantidadMonedas;i++){
            System.out.print("ingrese el valor de la moneda nro " + i + 1 + ": ");
            monedas[i] = scan.nextInt();
        }

        System.out.print("ingrese el valor que quiere alcanzar: ");
        monto = scan.nextInt();


    }
}
*/




import java.util.*;
import java.lang.*;
import java.io.*;



// driver program to test above function


public class Main
{

    public static void maximasActividades(int s[], int f[], int n)
    {
        int i, j;

        System.out.print("Following activities are selected : " + n + "\n");

        i = 0;
        System.out.print(i +" ");
        for (j = 0; j < n; j++)
        {

            if (s[j] > f[i])
            {
                System.out.print(j  +" ");
                i = j;
            }
        }
    }

    public static void main(String[] args)
    {
        int inicio[]={1, 2, 4, 4, 5, 6,7 ,9};
        int fin[] =  {6, 4, 5, 8, 7, 9,10,11};
        int cantidad = inicio.length;

        maximasActividades(inicio, fin, cantidad);
    }


}