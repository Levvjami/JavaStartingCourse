package com.timdaris;

public class Window {
    private String type;
    private String manufacturer;
    private int wingNum;
    private boolean opened;

    //constructors

    public Window(String type, String manufacturer, int wingNum, boolean opened) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.wingNum = wingNum;
        this.opened = opened;
    }

    //getters

    public boolean isOpened() {
        return opened;
    }


    //setters

    private void setOpened(boolean opened) {
        this.opened = opened;
    }

    //custom methods

    public void openOrCloseWindow(){
        if (opened){
            setOpened(false);
            System.out.println("Closing the window");
        }else{
            setOpened(true);
            System.out.println("Opening the window.");
        }
    }
}
