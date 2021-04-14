package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1d));
        System.out.println(area(5d, 4d));
        System.out.println(area(-1d, 4d));
    }

    public static double area(double radius){
        double returnValue = (radius < 0) ? -1d : Math.pow(radius, 2)*Math.PI;

        return returnValue;
    }

    public static double area(double x, double y){
        double returnValue = (x < 0 || y < 0) ? -1d : x*y;

        return returnValue;
    }
}
