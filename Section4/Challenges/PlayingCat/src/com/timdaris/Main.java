package com.timdaris;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean returnValue = false;

        if (summer){
            if (temperature < 46 && temperature > 24){
                returnValue = true;
            }
        }else{
            if (temperature < 36 && temperature > 24){
                returnValue = true;
            }
        }

        return returnValue;
    }
}
