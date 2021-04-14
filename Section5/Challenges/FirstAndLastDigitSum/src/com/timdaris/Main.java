package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(152));
    }

    public static int sumFirstAndLastDigit(int number){
        int returnValue = -1;

        if (number >= 0){
            int last = number % 10;
            int first = 0;

            while (number > 0){
                if (number < 10){
                    first = number;
                    break;
                }

                number /= 10;
            }
            returnValue = last + first;
        }

        return returnValue;
    }
}
