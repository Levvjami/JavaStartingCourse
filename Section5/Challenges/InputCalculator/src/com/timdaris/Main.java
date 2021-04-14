package com.timdaris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //challenge 1: input calc
        //inputThenPrintSumAndAverage();

        //challenge 2: paint job
        System.out.println("Part one");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("Part two");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println("Part three");
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));

    }

    //input calculator
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();

        int sum = 0;
        double numberEntered = 0;
        long avg = 0;

        while (true){
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                numberEntered++;
                sum += scanner.nextInt();
                scanner.nextLine();
            }else{
                avg = (long) Math.floor(sum/numberEntered + 0.5);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                scanner.nextLine();
                break;
            }
        }
        scanner.close();
    }

    //paint job
    public static int getBucketCount (double area, double areaPerBucket){
        int returnValue = -1;

        if (area > 0 && areaPerBucket > 0){
            int bucketsNeeded = (int) Math.ceil(area / areaPerBucket);

            returnValue = bucketsNeeded;
        }

        return returnValue;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket){
        int returnValue = -1;

        if (width > 0 && height > 0 && areaPerBucket > 0){
            double areaToPaint = width * height;
            int bucketsNeeded = (int) Math.ceil(areaToPaint / areaPerBucket);

            returnValue = bucketsNeeded;
        }

        return returnValue;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        int returnValue = -1;

        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0){
            double areaToPaint = width * height;
            int bucketsNeeded = (int) Math.ceil(areaToPaint / areaPerBucket);

            returnValue = bucketsNeeded - extraBuckets;
        }

        return returnValue;
    }
}
