package com.timdaris;

public class Point {
    private int x;
    private int y;

    //constructors

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setters

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //custom methods

    public double distance(){
        double returnValue = Math.sqrt(((-x)*(-x)) + ((-y) * (-y)));

        return returnValue;
    }

    public double distance(Point another){
        double returnValue = Math.sqrt(((another.x-this.x)*(another.x-this.x)) + ((another.y-this.y) * (another.y-this.y)));

        return returnValue;
    }

    public double distance(int x, int y){
        double returnValue = Math.sqrt(((x-this.x)*(x-this.x)) + ((y-this.y) * (y-this.y)));

        return returnValue;
    }

}
