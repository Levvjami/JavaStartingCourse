package com.timdaris;

public class Car extends Vehicle{
    private String brand;
    private String model;
    private int numOfGears;
    private int gear;
    private int steeringWheelPosition;

    //constructors

    public Car(String brand, String model, int numOfGears, int gear, int steeringWheelPosition) {
        super(5, 5, 0);
        this.brand = brand;
        this.model = model;
        this.numOfGears = numOfGears;
        this.gear = gear;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public Car(int seats, int doors, int speed, String brand, String model, int numOfGears, int gear, int steeringWheelPosition) {
        super(seats, doors, speed);
        this.brand = brand;
        this.model = model;
        this.numOfGears = numOfGears;
        this.gear = gear;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    //getters

    //setters

    //custom methods
    public void steering(int changedPosition) {
        if (steeringWheelPosition + changedPosition < -360 || steeringWheelPosition + changedPosition > 360){
            System.out.println("The steering wheel cannot turn any further in that direction.");
        }else {
            steeringWheelPosition += changedPosition;
            System.out.println("The car is now steering at an angle of " + steeringWheelPosition + '\u00B0' );
        }
    }

    public void changeGear(int changeBy){
        if (gear + changeBy < 0 ||gear + changeBy > numOfGears){
            System.out.println("There are no such gears in " + brand + "-" + model);
        }else{
            gear += changeBy;
            System.out.println("Currently driving in gear " + gear);
        }
    }
}
