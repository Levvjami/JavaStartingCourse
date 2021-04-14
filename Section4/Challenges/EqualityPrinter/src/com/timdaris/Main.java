package com.timdaris;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printEqual (int firstInt, int secondInt, int thirdInt){
        String printString;

        if (firstInt < 0 || secondInt < 0 || thirdInt < 0){
            printString = "Invalid Value";
        }else if(firstInt == secondInt && secondInt == thirdInt){
            printString = "All numbers are equal";
        }else if (firstInt != secondInt && secondInt != thirdInt && firstInt != thirdInt){
            printString ="All numbers are different";
        }else{
            printString = "Neither all are equal or different";
        }

        System.out.println(printString);
    }
}
