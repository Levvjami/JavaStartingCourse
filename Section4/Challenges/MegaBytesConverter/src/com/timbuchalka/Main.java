package com.timbuchalka;

public class Main {

    public static void main (String[] args){
            printMegaBytesAndKiloBytes(2500);
            printMegaBytesAndKiloBytes(-2500);
        }

        public static void printMegaBytesAndKiloBytes(int kiloBytes){
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes - (megaBytes * 1024);

            String output = kiloBytes < 0 ? "Invalid Value" : kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB";

            System.out.println(output);
        }
}
