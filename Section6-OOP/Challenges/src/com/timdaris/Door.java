package com.timdaris;

public class Door {
    private double height;
    private double width;
    private int wing;
    private boolean opened;
    private String material;
    private String manufacturer;
    private String color;

    //constructors

    public Door(double height, double width, boolean opened, int wing, String material, String manufacturer, String color) {
        this.height = height;
        this.width = width;
        this.opened = opened;
        this.wing = wing;
        this.material = material;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    //getters

    //setters

    //custom methods
    public void openDoor(){
        if (opened){
            System.out.println("The door is already opened.");
        }else{
            opened = true;
            System.out.println("Opened the door.");
        }
    }

    public void closeDoor(){
        if (opened){
            opened = false;
            System.out.println("Closing the door.");
        }else{
            System.out.println("The door is already closed.");
        }
    }
}
