package com.timdaris;

public class Cuboid extends Rectangle{
    private double height;

    //constructors

    public Cuboid(double width, double length, double height) {
        super(width, length);
        
        if (height < 0) {
            this.height = 0;
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
        return (super.getArea() * height);
    }

}
