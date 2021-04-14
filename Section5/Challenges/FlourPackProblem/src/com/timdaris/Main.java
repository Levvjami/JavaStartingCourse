package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    /*
    * Big count represents the large packages = 5kg
    * small count represents the small packages = 1kg
    * goal represents the amount of kilos needed to assemble a package
    * */
    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean returnValue = false;

        if (bigCount >= 0 && smallCount >= 0 && goal >= 0){
            int weight = 0;
            while(weight < goal){
                if (bigCount > 0 && weight + 5 <= goal){
                    weight += 5;
                    bigCount--;
                }else if(smallCount > 0 && weight + 1 <= goal){
                    weight++;
                    smallCount--;
                }else{
                    break;
                }
            }

            if (goal == weight){
                returnValue = true;
            }
        }

        return returnValue;
    }
}
