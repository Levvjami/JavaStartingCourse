package com.timdaris;

public class Carpet {
    private double cost;

    //constructors

    public Carpet(double cost) {
        if (cost < 0){
            this.cost = 0;
        }else{
            this.cost = cost;
        }
    }



    //getters

    public double getCost(){
        return this.cost;
    }

    //setters

    //custom methods

}
