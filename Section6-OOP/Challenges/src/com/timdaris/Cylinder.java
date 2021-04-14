package com.timdaris;

public class Cylinder extends Circle{
    private double height;

    //constructors

    public Cylinder(double radius, double height) {
        super(radius);
        if (height<0){
            this.height=0;
        }else{
            this.height = height;
        }
    }

    //getters

    public double getHeight() {
        return height;
    }

    //setters

    //custom methods

    public double getVolume(){
        return (super.getArea()*height);
    }
}
