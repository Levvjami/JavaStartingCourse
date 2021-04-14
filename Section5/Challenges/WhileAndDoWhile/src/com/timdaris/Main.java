package com.timdaris;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while(count != 5){
            System.out.println("Count value is: " + count);
            count++;
        }

        count = 0;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        System.out.println("****************");

        //isEvenNumber challenge
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){
            number++;
            if (!isEven(number)){
                // continue skips all code, even the code out of the if statement.
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound == 5){
                break;
            }
        }
        System.out.println("Total of even numbers found: " + evenNumbersFound);

        System.out.println("****************");

        //sumDigits challenge
        System.out.println(sumDigits(15));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(555));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(-15));
    }

    //isEvenNumber challenge
    public static boolean isEven(int number){

        return (number % 2 == 0) ? true : false;
    }

    //sumDigits challenge

    public static int sumDigits(int number){
        int returnValue = -1;

        if (number >= 10){
            returnValue = 0;
            int tempNumber = number;
            while (tempNumber > 0){
                returnValue += tempNumber % 10;
                tempNumber = tempNumber / 10;
            }
        }

        return returnValue;
    }
}
