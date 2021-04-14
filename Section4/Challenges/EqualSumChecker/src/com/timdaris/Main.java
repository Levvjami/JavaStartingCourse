package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber){
        boolean returnValue = (firstNumber + secondNumber == thirdNumber) ? true : false;

        return  returnValue;
    }
}
