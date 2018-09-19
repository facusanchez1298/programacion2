package Package;

public class Tablero {
  Pieza pieza;

    Tablero(){


    }

    public void mover(Pieza pieza, char x, int y){
        System.out.println("la pieza " + pieza.getTipo() + " se ha movido desde "
                + pieza.getX() + "-" + pieza.getY() + " hasta " + x + "-" + y);

        if ((x == 'a') ||  (x == 'b') || (x == 'c')
                || (x == 'd') || (x == 'e') || (x == 'f') || (x == 'g') || (x == 'h'))
        {
            if ((y > 0) && (y < 9)){
                pieza.cambiar(x, y);
            }

        }

    }
}
