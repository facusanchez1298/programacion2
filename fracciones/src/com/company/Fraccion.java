package com.company;

public class Fraccion {
    private int dividendo; //arriba
    private int divisor; //abajo

    Fraccion(int dividendo, int divisor){
        this.dividendo = dividendo;
        this.divisor = divisor;
    }



    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public void suma( Fraccion fraccion){

        if (this.getDivisor() == fraccion.getDivisor())
        {
            this.setDividendo((this.getDividendo() + fraccion.getDividendo()));

        }
        if (this.getDivisor() != fraccion.getDivisor())
        {
            fraccion.setDividendo(this.getDivisor() * fraccion.getDividendo());
            this.setDividendo(fraccion.getDivisor() * this.getDividendo());

            this.setDivisor(this.getDivisor() * fraccion.getDivisor());

            this.setDividendo((this.getDividendo() + fraccion.getDividendo()));
        }
    }

    public void multiplicacion( Fraccion fraccion){
        this.setDivisor(this.getDivisor() * fraccion.getDivisor());
        this.setDividendo(this.getDividendo() * fraccion.getDividendo());

    }

}
