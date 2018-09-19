package Package;


public class Pieza {
    public String getTipo() {
        return tipo;
    }

    public char getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private String tipo;
    private char x;
    private int y;
    private boolean blanco;

    Pieza(String tipo, boolean blanco, char x, int y){
        tipo.toLowerCase();
        this.blanco = blanco;

        if ((tipo == "rey") || (tipo == "reyna")|| (tipo == "alfil")|| (tipo == "caballo")|| (tipo == "torre") || (tipo == "peon")){
            this.tipo = tipo;
        }

        if ((x == 'a') ||  (x == 'b') || (x == 'c')
                || (x == 'd') || (x == 'e') || (x == 'f') || (x == 'g') || (x == 'h'))
        {
            this.x = x;

        }

        if ((y > 0) && (y < 9)){
            this.y = y;
        }
    }

    public void cambiar(char x, int y){
        this.x = x;
        this.y = y;
    }


}
