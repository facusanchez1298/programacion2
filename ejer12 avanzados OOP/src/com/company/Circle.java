package com.company;

public class Circle implements GeometricObject {
   double radius = 0.1;

   Circle(double radius){
       this.radius = radius;
   }


    @Override
    public double getPerimeter() {
        return this.radius + this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
