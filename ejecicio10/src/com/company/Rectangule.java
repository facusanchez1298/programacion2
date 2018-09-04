package com.company;

public class Rectangule extends  Shape
{
    protected double width;
    protected double length;

    public Rectangule(){

    }

    public Rectangule(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangule(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString()
    {
        return "soy un triangulo con " + this.width + " de alto y " + this.length + " de largo";
    }

    @Override
    public double getPerimetro()
    {
        return 2 *(this.length + this.width);
    }

    @Override
    public double getArea()
    {
        return this.length * this.width;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }


}
