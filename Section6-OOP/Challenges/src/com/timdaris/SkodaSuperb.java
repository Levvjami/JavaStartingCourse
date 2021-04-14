package com.timdaris;

public class SkodaSuperb extends Car{
    private int umbrellaCompartment;
    private boolean inUse;

    //constructors

    public SkodaSuperb(int numOfGears, int gear, int steeringWheelPosition, int umbrellaCompartment, boolean inUse) {
        super(5, 5, 0, "Skoda", "Superb", numOfGears, gear, steeringWheelPosition);
        this.umbrellaCompartment = umbrellaCompartment;
        this.inUse = inUse;
    }

    public SkodaSuperb(int seats, int doors, int speed, String brand, String model, int numOfGears, int gear, int steeringWheelPosition, int umbrellaCompartment, boolean inUse) {
        super(seats, doors, speed, brand, model, numOfGears, gear, steeringWheelPosition);
        this.umbrellaCompartment = umbrellaCompartment;
        this.inUse = inUse;
    }

    //getters

    //setters

    //custom methods
    public void umbrellaCompartmentInUse(){
       if (inUse){
           System.out.println("The umbrella compartment is currently in use");
       }else {
           System.out.println("The umbrella compartment is free");
       }
    }
}
