package com.company;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double monto){
        if(monto > 0){
            this.cantidad += monto;
        }
    }

    public void debitar(double monto){
        if(this.cantidad < monto){
            System.out.print("no tiene suficiente dinero, se le debitaran solo los "
                    + this.cantidad + " disponibles. su cuenta queda en $0");
        }
        else {
            this.cantidad -= monto;
        }
    }


}
