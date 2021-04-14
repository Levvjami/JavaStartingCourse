package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){
        boolean returnValue = false;

        if (number > 0){
            int sum = 0;
            for (int i = 1; i < number; i++){
                if (number%i == 0){
                    sum += i;
                }
            }
            if (sum == number){
                returnValue = true;
            }
        }

        return returnValue;
    }
}
