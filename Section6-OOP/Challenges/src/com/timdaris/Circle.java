package com.timdaris;

public class Circle {
    private double radius;

    //constructors

    public Circle(double radius) {
        if (radius < 0){
            this.radius = 0;
        }else {
            this.radius= radius;
        }
    }

    //getters

    public double getRadius() {
        return radius;
    }

    //setters

    //custom methods

    public double getArea(){
        return (Math.PI*Math.pow(radius,2));
    }
}
