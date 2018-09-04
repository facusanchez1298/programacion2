package com.company;

public class Circle {
    private double radius;

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area;
        area = Math.PI * (this.radius * this.radius);


        return area;
    }

    public double getCircunferencia(){
        double circunferencia;
        circunferencia = Math.PI * (this.radius + this.radius);

        return  circunferencia;
    }

    public String verRadio(){
        String radio = "circle[radius = " + this.radius + "]";
        return radio;
    }




}
