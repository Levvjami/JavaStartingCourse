package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(2));
    }

    public static int getLargestPrime(int number){
        int returnValue = -1;

        if (number > 1){
            for (int i = number; i > 0; i--){
                if (number % i == 0){
                    if (i % 2 == 0 && i != 2){
                        continue;
                    }else{
                        boolean foundFactor = false;
                        for (int j = 1; j <= Math.sqrt(i); j++){
                            if (i%j == 0 && j != 1){
                                foundFactor = true;
                            }
                        }
                        if (!foundFactor){
                            returnValue = i;
                            break;
                        }
                    }
                }
            }

        }
        return returnValue;
    }
}
