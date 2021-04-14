package com.timdaris;

public class Main {

    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()){
            case "january" :
                System.out.println("Jan");
                break;
            case  "june" :
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

        //challenge
        char switchChar = 'Z';
        switch (switchChar) {
            case 'A':
                printPositionInAlphabet(1);
                break;
            case 'B':
                printPositionInAlphabet(2);
                break;
            case 'C':
                printPositionInAlphabet(3);
                break;
            case 'D':
                printPositionInAlphabet(4);
                break;
            case 'E':
                printPositionInAlphabet(5);
                break;
            default:
                printPositionInAlphabet(7);
                break;
        }
    }

    public static void printPositionInAlphabet(int position){
        switch (position%10){
            case 1:
                System.out.println("The character is the " + position + "st letter of the alphabet");
                break;
            case 2:
                System.out.println("The character is the " + position + "nd letter of the alphabet");
                break;
            case 3: case 4: case 5:
                System.out.println("The character is the " + position + "rd letter of the alphabet");
                break;
            default:
                System.out.println("The character is positioned after the letter E");
                break;
        }
    }
}
