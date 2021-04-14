package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year){
        boolean returnValue = false;

        if ((year%4 == 0 && year%100 != 0) || year%400 == 0){
            if (year >= 1 && year <= 9999){
                returnValue = true;
            }
        }

        return returnValue;
    }

    public static int getDaysInMonth(int month, int year){
        int returnValue = -1;

        if ((month > 0 && month < 13) && (year > 0 && year < 10000)){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    returnValue = 31;
                    break;
                case 2:
                    returnValue = isLeapYear(year) ? 29 : 28;
                    break;
                default:
                    returnValue = 30;
            }
        }

        return returnValue;
    }


}
