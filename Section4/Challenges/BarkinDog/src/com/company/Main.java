package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean returnValue = false;
        if (barking){
            if (hourOfDay < 8 && hourOfDay >= 0){
                returnValue = true;
            }else if (hourOfDay == 23){
                returnValue = true;
            }
        }
        return returnValue;
    }
}
