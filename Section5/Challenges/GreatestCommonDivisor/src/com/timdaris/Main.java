package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(30, 12));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int returnValue = -1;

        if (validateNumber(first) && validateNumber(second)){
            for (int i = first; i>0; i--){
                if (first%i == 0 && second%i == 0){
                    returnValue = i;
                    break;
                }
            }
        }

        return returnValue;
    }

    public static boolean validateNumber(int number){
        return (number > 9);
    }
}
