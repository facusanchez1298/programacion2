package com.company;

public class Pieza {

    private String tipo;
    private char x; ///cordenadas x van desde la 'a' hasta la 'h'
    private int y; ///cordenadas y van desde 1 hasta 8
    private boolean blanco; ///verificamos si es blanco(true) o negro(false)
    char[] caracteres = {'a', 'b', 'c','d','e','f','g','h'};///posibles caracteres para x


    ///constructores
    Pieza(String tipo, boolean blanco, char x, int y){
        tipo.toLowerCase();///pasamos todo a minuscula para hacer las comprobaciones mas comodas
        this.blanco = blanco;///definimos el color

        if ((tipo == "rey") || (tipo == "reyna")|| (tipo == "alfil")|| (tipo == "caballo")
                || (tipo == "torre") || (tipo == "peon")){
            this.tipo = tipo;///definimos el tipo dentro de los posibles
        }

        if (posible(x))///verifica que el caracter ingresado sea correcto
        {
            this.x = x;
        }

        if ((y > 0) && (y < 9)){
            this.y = y;
        }
    }

    public boolean cambiar(char x, int y){
        ///este es el metodo para saber si una pieza puede o no hacer un movimiento, lo modularice a un metodo por pieza
        if(posible(x)){
            if ((y > 0) && (y < 9)) {

                switch (this.getTipo().toLowerCase()){
                    case "rey":
                        if(movimientoRey(x,y)){
                        return true;
                        }
                        else return false;

                    case "peon":
                        if(movimientoPeon(x,y)){
                        return true;
                        }
                        else return false;
                    case "torre":
                        if(movimientoTorre(x,y)){
                        return true;
                        }
                        else return false;
                    case "caballo":
                        if(movimientoCaballo(x,y)){
                        return true;
                        }
                        else return false;
                    case "alfil":
                        if(movimientoAlfil(x,y)){
                            return true;
                        }
                        else return false;
                    case "reyna":
                        if(movimientoReyna(x,y)){
                            return true;
                        }
                        else return false;
                }
            }
        }
        return false;
    }

    private boolean posible(char x){
        ///verifica que el caracter ingresado sea valido

        String.valueOf(x).toLowerCase();

        for (int i = 0; i<8; i++){
            if(x == caracteres[i]){
                return true;
            }
        }
        return false;
    }

    private boolean movimientoReyna(char x, int y) {
        ///verifica si es posible el movimiento de la reyna
        if((movimientoAlfil(x,y)) || (movimientoTorre(x,y))){
            this.x = x;
            this.y = y;
            return true;
        }
        else return false;
    }

    private boolean movimientoRey( char x, int y){
        ///verifica si es posible el movimiento del rey
        String.valueOf(x).toLowerCase();
        if((y - this.getY() >= -1) && (y - this.getY() <= 1)){
            if((x - this.getX() >= -1) && (x - this.getX() <= 1)){
                this.x = x;
                this.y = y;
                return true;
            }
        }
        return false;
    }

    private boolean movimientoPeon(char x, int y){
        ///verifica si es posible el movimiento de los peones
        String.valueOf(x).toLowerCase();
        if(x == this.getX()){
            if(Math.abs(this.getY() - y) == 1){
                this.y = y;
                this.x = x;
                return true;
            }
        }
        return false;
    }

    private boolean movimientoTorre(char x, int y){
        ///verifica si es posible el movimiento de las torres
        String.valueOf(x).toLowerCase();
        if((this.getY() == y) || (this.getX() == x)){
            this.y =y;
            this.x = x;
            return true;
        }
        return false;
    }

    private boolean movimientoCaballo(char x, int y){
        ///verifica si es posible el movimiento de los caballos
        String.valueOf(x).toLowerCase();
        if((Math.abs(this.getY() - y) == 2) && (Math.abs(this.getX() - x) == 1)){
            this.y =y;
            this.x = x;
            return true;
        }
        if((Math.abs(this.getY() - y) == 1) && (Math.abs(this.getX() - x) == 2)){
            this.y =y;
            this.x = x;
            return true;
        }
        return false;
    }

    private boolean movimientoAlfil(char x, int y) {
        ///verifica si es posible el movimiento de los alfiles
        String.valueOf(x).toLowerCase();
        int resultado1 = Math.abs(this.getY() - y);
        int resultado2 = Math.abs(this.getX() - x);
        if (resultado1 == resultado2) {
            this.y =y;
            this.x = x;
            return true;
        }
        else return false;
    }



    ///getters y setters

    public String getTipo(){
        return tipo;
    }

    public char getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean isBlanco(){
        return blanco;
    }



}
