package com.timdaris;

public class Bedroom {
    private String name;
    private AnotherWall wall1;
    private AnotherWall wall2;
    private AnotherWall wall3;
    private AnotherWall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    //constructor

    public Bedroom(String name, AnotherWall wall1, AnotherWall wall2, AnotherWall wall3, AnotherWall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    //getters

    public Lamp getLamp() {
        return lamp;
    }

    //setters

    //custom methods
    public void makeBed(){
        System.out.println("Bedroom -> Making bed | ");
        bed.make();
    }
}
