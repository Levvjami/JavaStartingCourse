package com.timdaris;

public class Vehicle {
    private int seats;
    private int doors;
    private int speed;

    //constructors

    public Vehicle(int seats, int doors, int speed) {
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
    }

    //getters

    //setters

    //custom methods
    public void steering(){

    }

    public void changeSpeed(int speedDifference){
        if (speed + speedDifference < 0){
            System.out.println("The vehicle has stopped already.");
        }else{
            speed += speedDifference;
            System.out.println("The vehicle is currently moving at a speed of: " + speed);
        }
    }
}
