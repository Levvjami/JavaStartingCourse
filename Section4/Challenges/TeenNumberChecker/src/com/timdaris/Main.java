package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen (int firstInt, int secondInt, int thirdInt){
        boolean returnValue = true;

        if (!isTeen(firstInt)){
            if (!isTeen(secondInt)){
                if (!isTeen(thirdInt)){
                    returnValue = false;
                }
            }
        }

        return returnValue;
    }

    public static boolean isTeen (int age){
        boolean returnValue = (age < 13 || age > 19) ? false : true;
        return returnValue;
    }
}
