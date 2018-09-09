package com.company;

public class ResizableCircle extends Circle implements Resizable {


    ResizableCircle(double radius){
        super(radius);
    }

    public void resizable(int percent){
        this.radius = percent / 100 * this.radius;
    }
}
