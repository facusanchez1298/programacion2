package com.company;

public class Scuare extends Rectangule {

    public Scuare(double side, String color, boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public Scuare(double side)
    {
        this.width = side;
        this.length = side;
    }

    public double getSide()
    {
        return this.length;
    }

    public void setSide(double side)
    {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double side)
    {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side)
    {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString()
    {
        return "soy un cuadrado y mis lados son iguales, todos miden: " + this.length;
    }

}
