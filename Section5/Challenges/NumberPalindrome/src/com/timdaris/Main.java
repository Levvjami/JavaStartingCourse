package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1212));
        System.out.println(isPalindrome(17755771));
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int number){

        int tempNumber = (number < 0) ? number * (-1) : number;
        int reverseNumber = 0;
        while (tempNumber > 0){
            reverseNumber = (10 * reverseNumber) + tempNumber%10;
            tempNumber /= 10;
        }

        return (reverseNumber == number || reverseNumber == number * (-1));

    }
}
