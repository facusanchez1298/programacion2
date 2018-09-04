package com.company;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "x = " + this.x + " e y = " + this.y;
    }

    public void moveUp(){
        this.y = this.y + this.ySpeed;
    }

    public void moveDown(){
        this.y = this.y - this.ySpeed;
    }

    public void moveRight(){
        this.x = this.x + this.xSpeed;
    }

    public void moveLeft(){
        this.x = this.x - this.xSpeed;
    }



}
