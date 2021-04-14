package com.timdaris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer. MIN_VALUE;
        int number =0;

        while(true){
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                number =  scanner.nextInt();
                if (number < min){
                    min = number;
                }else if(number > max){
                    max = number;
                }
            }else{
                break;
            }
            scanner.nextLine();
        }

        scanner.close();

        System.out.println("The min number is: " + min);
        System.out.println("The max number is: " + max);
    }
}
