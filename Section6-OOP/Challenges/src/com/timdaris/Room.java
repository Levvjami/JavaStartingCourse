package com.timdaris;

public class Room {
    private Window window;
    private Curtain curtain;
    private Door door;

    //constructors

    public Room(Window window, Curtain curtain, Door door) {
        this.window = window;
        this.curtain = curtain;
        this.door = door;
    }

    //getters

    public Window getWindow() {
        return window;
    }

    public Curtain getCurtain() {
        return curtain;
    }

    public Door getDoor() {
        return door;
    }


    //setters

    //custom methods
    public void enterRoom(){
        door.openDoor();
    }

    public void checkIfWindowOpened(){
        curtain.openCurtain();
        if (window.isOpened()){
            System.out.println("The window is open.");
        }else{
            window.openOrCloseWindow();
        }
    }
}
