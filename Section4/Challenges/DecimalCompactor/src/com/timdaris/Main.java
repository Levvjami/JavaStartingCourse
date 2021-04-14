package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){
        int firstInt = (int) (firstNumber * 1000);
        int secondInt = (int) (secondNumber * 1000);

        boolean returnValue = (firstInt != secondInt) ? false : true;

        return returnValue;
    }
}
