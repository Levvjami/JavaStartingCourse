package com.timdaris;

public class Main {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number){
        if (number >= 5){
            for (int i = 0; i < number; i++){
                for (int j = 0; j < number; j++){
                    if (i == 0 || j == 0 || i == number-1 || j == number-1){
                        System.out.print("*");
                    }else if (i == j) {
                        System.out.print("*");
                    }else if (i == number - j - 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("Invalid Value");
        }
    }
}
