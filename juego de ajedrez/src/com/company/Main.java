package com.company;

public class Main {

    public static void main(String[] args) {
	Tablero tablero = new Tablero();
	tablero.mover(tablero.torreA1, 'a', 3);///movimiento correcto
	tablero.mover(tablero.torreA1, 'c', 3);///movimiento correcto
	tablero.mover(tablero.torreA1, 'a', 7);///movimiento invalido para la torre
	tablero.mover(tablero.torreA1, 'a', 12);///esta linea prueba el mensaje de error



    }
}
