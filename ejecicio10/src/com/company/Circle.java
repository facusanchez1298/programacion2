package com.company;

public class Circle extends Shape
{

    protected double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }


    @Override
    public String toString()
    {
        return "soy un circulo y mi radio es " + this.radius;
    }

    @Override
    public double getPerimetro()
    {
        return (radius + radius) * Math.PI;
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(this.radius,2);
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
