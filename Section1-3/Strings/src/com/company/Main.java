package com.company;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", \u00A9 2019";
        System.out.println("myString is equal to: " + myString);
        String numberString ="250.55";
        System.out.println(numberString + "49.95");

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is an error!");
        }
    }
}
