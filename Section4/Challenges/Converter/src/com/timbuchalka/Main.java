package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
    // to miles per hour
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

    //print conversion
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return (long) -1.0;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
       String output = kilometersPerHour < 0 ?  "Invalid number" : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h.";
       System.out.println(output);

    }
}
