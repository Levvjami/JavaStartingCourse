package com.timdaris;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(36100));
    }

    public static String getDurationString(int seconds){
        String returnValue = "Invalid value1";
        if (seconds >= 0){
            int minutes = seconds / 60;
            int newSeconds = seconds - minutes * 60;
            returnValue = getDurationString(minutes, newSeconds);
        }

        return returnValue;

    }

    public static String getDurationString(int minutes, int seconds){
        String returnValue = "Invalid value2";
        System.out.println(seconds);
        if (minutes >= 0 && seconds >= 0 && seconds <= 59){
            int hours = minutes / 60;
            int newMinutes = minutes - hours * 60;
            String returnHour = (hours > 9) ? hours + "h " : "0" + hours +"h ";
            String returnMinute = (newMinutes > 9) ? newMinutes + "m " : "0" + newMinutes +"m ";
            String returnSecond = (seconds > 9) ? seconds + "s " : "0" + seconds +"s";

            returnValue = returnHour + returnMinute + returnSecond;
        }

        return returnValue;
    }
}
