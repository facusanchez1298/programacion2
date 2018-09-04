package com.company;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint movablePoint;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        MovablePoint movablePoint = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        this.movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        this.movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        this.movablePoint.moveRight();
    }
}
