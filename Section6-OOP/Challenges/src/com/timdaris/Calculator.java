package com.timdaris;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    //constructors

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //getters

    //setters

    //custom methods
    public double getTotalCost(){
        return this.carpet.getCost() * this.floor.getArea();
    }
}
