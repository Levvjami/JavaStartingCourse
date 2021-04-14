package com.timdaris;

public class Curtain {
    private String color;
    private String material;
    private double length;
    private double width;
    private double transparency;

    //constructors

    public Curtain(String color, String material, double length, double width, double transparency) {
        this.color = color;
        this.material = material;
        this.length = length;
        this.width = width;
        this.transparency = transparency;
    }

    //getters

    //setters

    //custom methods

    public void openCurtain(){
        System.out.println("Opening the curtain.");
    }
}
