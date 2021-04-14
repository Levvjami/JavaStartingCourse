package com.timdaris;

public class Main {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors (int number){
        String printValue = "Invalid Value";

        if (number > 0){
            printValue = "";
            for (int i = 1; i <= number; i++){
                if (number%i == 0){
                    printValue += " " + i;
                }
            }
        }

        System.out.println(printValue);
    }
}
