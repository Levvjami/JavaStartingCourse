package com.timdaris;

public class Toner {
    private String color;
    private int percentLeft;

    //constructors

    public Toner(String color) {
        this(color, 100);
    }

    public Toner(String color, int percentLeft) {
        this.color = color;
        if (percentLeft <= 100 && percentLeft >= 0){
            this.percentLeft = percentLeft;
        }else{
            this.percentLeft = 50;
        }
    }

    //getters

    public String getColor() {
        return color;
    }

    public int getPercentLeft() {
        return percentLeft;
    }

    //setters

    //custom methods
    public boolean isEmpty(){
        //return (this.percentLeft == 0) ? true : false ;
        return this.percentLeft == 0;
    }

    public boolean depleteToner(int depleteBy){
        if (percentLeft > depleteBy){
            percentLeft -= depleteBy;
            return true;
        }else if(percentLeft == depleteBy){
            percentLeft = 0;
            System.out.println("Toner " + this.color + " will need refilling after this job.");
            return true;
        }else {
            return false;
        }
    }

    public void reFill(int addedPercent){
        if (addedPercent <= 0){
            System.out.println("This functionality can only refill the toner.");
        }else {
            int newTotal = addedPercent + this.percentLeft;
            if (newTotal <= 100){
                this.percentLeft = newTotal;
            }else{
                this.percentLeft = 100;
            }
            System.out.println(this.color + " toner has been filled to " + this.percentLeft + "%");
        }
    }
}
