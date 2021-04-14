package com.timdaris;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    //constructors

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    //getters

    //setters

    //custom methods

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();

        super.move(speed);
    }

}
