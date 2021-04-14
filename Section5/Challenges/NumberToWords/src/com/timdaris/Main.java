package com.timdaris;

public class Main {

    public static void main(String[] args) {
	    numberToWords(123);
	    numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
    }

    public static void numberToWords(int number){
        String printString = "Invalid Value";

        int reverseNumber = reverse(number);
        if (reverseNumber >= 0){
            printString = "";
            int countDigits = 0;
            while(reverseNumber > 0){
                countDigits++;
                switch (reverseNumber%10) {
                    case 0:
                        printString += "Zero";
                        break;
                    case 1:
                        printString += "One";
                        break;
                    case 2:
                        printString += "Two";
                        break;
                    case 3:
                        printString += "Three";
                        break;
                    case 4:
                        printString += "Four";
                        break;
                    case 5:
                        printString += "Five";
                        break;
                    case 6:
                        printString += "Six";
                        break;
                    case 7:
                        printString += "Seven";
                        break;
                    case 8:
                        printString += "Eight";
                        break;
                    default:
                        printString += "Nine";
                }
                reverseNumber /= 10;

                if (reverseNumber > 0){
                    printString += " ";
                }
            }


            if (getDigitCount(number) != countDigits){
                for (int i = 0; i < getDigitCount(number) - countDigits; i++){
                    printString += " Zero";
                }
            }
        }

        if (number == 0){
            printString = "Zero";
        }

        System.out.println(printString);
    }

    public static int reverse(int number){
        int returnValue = 0;
        int returnToNegative = 1;
        if (number < 0){
            number *= (-1);
            returnToNegative = -1;
        }
        while (number > 0){
            returnValue = (returnValue * 10) + (number % 10);
            number /= 10;
        }
        return  returnValue * returnToNegative;
    }

    public static int getDigitCount(int number){
        int returnValue = (number == 0) ? 1 : 0;
        if (number < 0){
            returnValue = -1;
        }
        while (number > 0){
            returnValue++;
            number /= 10;
        }
        return returnValue;
    }
}
