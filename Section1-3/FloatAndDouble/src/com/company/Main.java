package com.company;

import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println(myMaxFloatValue);
        System.out.println(myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println(myMaxDoubleValue);
        System.out.println(myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double pounds = 200d;
        double kilos = pounds * 0.45359237d;

        System.out.println(kilos);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_891;

        System.out.println(pi);
        System.out.println(anotherNumber);


    }
}
