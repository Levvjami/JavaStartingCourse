package com.timdaris;

public class Wall {
    private double width;
    private double height;

    //constructors

    public  Wall(){
        this(0, 0);
    }

    public  Wall(double width, double height){
        if (width < 0 && height < 0){
            this.height = 0;
            this.width = 0;
        }else if (width < 0){
            this.height = height;
            this.width = 0;
        }else if (height < 0){
            this.height = 0;
            this.width = width;
        }else{
            this.height = height;
            this.width = width;
        }
    }

    //getters

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //setters

    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    //custom methods

    public double getArea(){
        return height * width;
    }


}


