package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        int returnValue = -1;

        if (number >= 0){
            returnValue = 0;
            int digit = 0;
            while(number > 0){
                digit = number%10;
                if (digit%2 == 0){
                    returnValue += digit;
                }
                number /= 10;
            }
        }

        return returnValue;
    }
}
