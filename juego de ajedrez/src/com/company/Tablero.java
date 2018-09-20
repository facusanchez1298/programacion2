package com.company;

public class Tablero {

    char[] caracteres = {'a', 'b', 'c','d','e','f','g','h'};///caracteres posibles para x

    ///fichas

    ///caballos
    Pieza caballoB1;
    Pieza caballoG1;
    Pieza caballoB8;
    Pieza caballoG8;

    ///alfiles
    Pieza alfilC1;
    Pieza alfilf1;
    Pieza alfilC8;
    Pieza alfilf8;

    ///torres
    Pieza torreA1;
    Pieza torreH1;
    Pieza torreA8;
    Pieza torreH8;

    ///realeza
    Pieza reyBlanco;
    Pieza reynaBlanca;
    Pieza reynegro;
    Pieza reynaNegra;

    ///peones
    Pieza[] peonesBlancos;
    Pieza[] peonesNegros;


    Tablero(){
        ///inicializamos todas las fichas
        iniciarAlfiles();
        iniciarCaballos();
        iniciarPeones();
        iniciarReyes();
        iniciarTorres();
    }

    public void mover(Pieza pieza, char x, int y){
        ///mover utiliza metodos de la clase Pieza para realizar comprobaciones de los movimientos, luego ejecuta un mensaje
        char xVieja = pieza.getX(); ///guardamos las cordenas anteriores para mostrar en el mensaje
        int yVieja = pieza.getY();  ///guardamos las cordenas anteriores para mostrar en el mensaje

        if (posible(x))
        {
            if ((y > 0) && (y < 9)){
                if(pieza.cambiar(x, y)){
                    ///verificamos que el movimiento sea posible, en caso que si se muestra el movimiento
                    System.out.println("la pieza " + pieza.getTipo() + " se ha movido desde "
                            + String.valueOf(xVieja).toUpperCase() + yVieja + " hasta " + String.valueOf(x).toUpperCase() + y);
                }
                else System.out.print("esta pieza no puede realizar este movimiento");
            }
            else throw new RuntimeException("la y no puede ser mayor a '9' ni menor a '1'");
        }
        else throw new RuntimeException("la x no puede ser mayor a 'h' ni menor a 'a'");
    }

    private boolean posible(char x){
        ///verifica si el caracter es valido
        String.valueOf(x).toLowerCase();

        for (int i = 0; i<8; i++){
            if(x == caracteres[i]){
                return true;
            }
        }
        return false;
    }

    public void iniciarCaballos(){
        ///inicia los caballos
        caballoB1 = new Pieza("caballo", true, 'b',1);
        caballoG1 = new Pieza("caballo", true, 'g',1);
        caballoB8 = new Pieza("caballo",false,'b', 8);
        caballoG8 = new Pieza("caballo", false, 'g', 8);
    }

    public void iniciarAlfiles(){
        ///inicia los alfiles
        alfilC1 = new Pieza("alfil", true, 'c',1);
        alfilf1 = new Pieza("alfil", true, 'f',1);
        alfilC8 = new Pieza("alfil", false, 'c',8);
        alfilf8 = new Pieza("alfil", false, 'f',8);
    }

    public void iniciarTorres(){
        ///inicia las torres
        torreA1 = new Pieza("torre", true, 'a', 1);
        torreH1 = new Pieza("torre", true, 'h', 1);
        torreA8 = new Pieza("torre", false, 'a', 8);
        torreH8 = new Pieza("torre", false, 'h', 8);
    }

    public void iniciarReyes(){
        ///inicia los reyes y reynas
        reyBlanco = new Pieza("rey", true, 'd',1);
        reynegro = new Pieza("rey", false, 'e',8);
        reynaBlanca = new Pieza("reyna", true, 'e', 1);
        reynaNegra = new Pieza("reyna", false, 'd', 8);

    }

    public void iniciarPeones(){
        ///inicia los peones
        peonesBlancos = new Pieza[8];
        peonesNegros = new Pieza[8];

        for(int i = 0; i<8; i++){
            peonesBlancos[i] = new Pieza("peon", true, caracteres[i], 2);
            peonesNegros[i] = new Pieza("peon", false, caracteres[i], 7);

        }
    }
}
