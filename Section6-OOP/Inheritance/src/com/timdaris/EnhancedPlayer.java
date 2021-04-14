package com.timdaris;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    //constructor

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    //getters

    public int getHealth() {
        return hitPoints;
    }

    //setters

    //custom method

    public int healthRemaining(){
        return this.hitPoints;
    }


}
