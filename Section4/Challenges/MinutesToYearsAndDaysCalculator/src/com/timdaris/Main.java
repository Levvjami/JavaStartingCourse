package com.timdaris;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printYearsAndDays(long minutes){
        String printString = (minutes < 0) ? "Invalid Value" : "0 min = 0 y and 0 d";

        if (minutes > 0){
            // one day is 1440 minutes
            long days = minutes / 1440l;
            // long remainingMinutes = minutes % days;
            // one year is 365 days
            long years = days / 365l;
            long remainingDays = days - years * 365;

            printString = minutes + " min = " + years + " y and " + remainingDays + " d";
        }
        System.out.println(printString);
    }

}
