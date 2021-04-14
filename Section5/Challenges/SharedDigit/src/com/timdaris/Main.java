package com.timdaris;

public class Main {

    public static void main(String[] args) {
        //System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        //System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        boolean returnValue = false;

        if ((firstNumber > 9 && firstNumber < 100) && (secondNumber > 9 && secondNumber < 100)){
            int tempNumber;
            int digit = 0;
            while(firstNumber > 0){
                tempNumber = secondNumber;
                digit = firstNumber % 10;
                while (tempNumber > 0){
                    if (digit == tempNumber%10){
                        returnValue = true;
                        break;
                    }
                    tempNumber /= 10;
                }
                firstNumber /= 10;
            }
        }

        return returnValue;
    }
}
