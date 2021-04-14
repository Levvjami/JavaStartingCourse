package com.company;

public class Main {

    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        secondDouble = (secondDouble + firstDouble) * 100.00d;
        System.out.println("Total value: " + secondDouble);
        secondDouble %= 40.00d;
        System.out.println("The reminder: " + secondDouble);

        boolean isRemainderZero = secondDouble == 0 ? true : false;

        System.out.println(isRemainderZero);

        if (!isRemainderZero){
            System.out.println("Got some remainder");
        }
    }
}
