package com.timdaris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle nex line character (enter key)

            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            System.out.println("Your name is " + name + ", you are " + age + " years old.");
        }else{
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
        */

        //challenge

        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (count < 11){
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                count ++;
                sum += scanner.nextInt();
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("The sum of the numbers entered is: " + sum);

        scanner.close();

    }
}
