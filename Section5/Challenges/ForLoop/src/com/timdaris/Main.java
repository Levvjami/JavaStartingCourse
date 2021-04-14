package com.timdaris;

public class Main {

    public static void main(String[] args) {
        //String.format("%.2f", value) formats the value to only show the first 2 decimal points
	    for (int i= 2; i<9; i++){
            System.out.println( i + "% interest of 10,000 is: " + String.format("%.2f", calculateInterest(10000d, i)));
        }

        System.out.println("**************");

	    for (int i= 8; i>1; i--){
            System.out.println( i + "% interest of 10,000 is: " + String.format("%.2f", calculateInterest(10000d, i)));
        }

        System.out.println("**************");

	    int count = 0;
	    for (int i= 70; i<100; i++){
	        if (isPrime(i)){
	            count++;
                System.out.println("Number " + i + " is a prime number; Total prime numbers found: " + count);
            }
	        if (count == 3){
	            break;
            }
        }

	    //challenge sum 3 and 5
        System.out.println("**************");

        int countSum = 0;
	    int sum = 0;
        for (int i= 1; i <= 1000; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.println("Adding number " + i);
                countSum++;
                sum += i;
                if (countSum >= 5){
                    break;
                }
            }
        }
        System.out.println("The total sum is: " + sum);


    }

    public static boolean isPrime(int n){

        if (n == 1 || n == 0){
            return false;
        }

        for (int i= 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    //challenge isOdd
    public static boolean isOdd(int value){
        boolean returnValue = false;

        if (value > 0){
            if (value % 2 != 0){
                returnValue = true;
            }
        }

        return returnValue;
    }

    public static int sumOdd(int start, int end){
        int returnValue = -1;

        if (end > start){
            if (end >= 0 && start > 0){
                returnValue = 0;
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        returnValue += i;
                    }
                }
            }
        }

        return returnValue;
    }
}
