package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit (int first, int second, int third){
        boolean returnValue = false;

        if (isValid(first) && isValid(second) && isValid(third)){
            if (first%10 == second%10){
                returnValue = true;
            }else if(first%10 == third%10){
                returnValue = true;
            }else if (second%10 == third%10){
                returnValue = true;
            }
        }

        return returnValue;
    }

    public static boolean isValid(int value){
        return value > 9 && value <= 1000;
    }
}
