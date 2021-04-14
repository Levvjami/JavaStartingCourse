package com.timdaris;

public class Main {

    public static void main(String[] args) {
      /*
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
      */

        //challenge
        System.out.println(calcFeetAndInchesToCentimeters(153));

    }
/*
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }
*/
    //challenge

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        double returnValue;

        if (feet < 0 || inches < 0 || inches > 12){
            returnValue = -1.0d;
        }else{
            returnValue = ((feet * 12) + inches) * 2.54;
        }

        return returnValue;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        double returnValue;
        if (inches < 0){
            returnValue = -1.0d;
        }else{
            int feet = inches / 12;
            int remainingInches = inches - (feet * 12);
            returnValue = calcFeetAndInchesToCentimeters(feet, remainingInches);
        }

        return returnValue;
    }


}
