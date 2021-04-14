package com.timdaris;

import java.util.Locale;

public class Printer {
    private Toner blackInk;
    private Toner red;
    private Toner green;
    private Toner blue;
    private int pagesPrinted;
    private boolean duplex;

    //constructors

    public Printer(int pagesPrinted, boolean duplex) {
        this(new Toner ("black"), new Toner ("red"), new Toner ("green"), new Toner ("blue"), 0, true);
    }

    public Printer(Toner blackInk, Toner red, Toner green, Toner blue, int pagesPrinted, boolean duplex) {
        this.blackInk = blackInk;
        this.red = red;
        this.green = green;
        this.blue = blue;
        if (pagesPrinted < 0){
            this.pagesPrinted = 0;
        }else{
            this.pagesPrinted = pagesPrinted;
        }
        this.duplex = duplex;
    }

    //getters

    public Toner getBlackInk() {
        return blackInk;
    }

    public Toner getRed() {
        return red;
    }

    public Toner getGreen() {
        return green;
    }

    public Toner getBlue() {
        return blue;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    //setters

    //custom methods
    private String getTonerLevel(Toner toner){
        return (toner.getPercentLeft() + "%");
    }
    public void checkTonerLevels(){
        System.out.println("Black toner level: " + getTonerLevel(blackInk));
        System.out.println("Red toner level: " + getTonerLevel(red));
        System.out.println("Green toner level: " + getTonerLevel(green));
        System.out.println("Blue toner level: " + getTonerLevel(blue));
    }

    public void print(int pages, boolean doubleSided, boolean colored){
        if (colored && (blackInk.isEmpty() || red.isEmpty() || green.isEmpty() || blue.isEmpty())){
            System.out.println("Out of ink. Please check the toner levels.");
        }else if(!colored && blackInk.isEmpty()){
            System.out.println("Out of black ink. Please refill the toner.");
        }else{
            System.out.println("Printing in progress.");
            if (pages < 0){
                pages += -1;
            }else if(pages == 0){
                System.out.println("Nothing to print.");
            }
            if (pages != 0){
                int multiplier = 1;
                if (doubleSided){
                    multiplier = 2;
                }

                pagesPrinted = pagesPrinted + (pages * multiplier);
                boolean enoughBlack = blackInk.depleteToner(pages * multiplier);;
                boolean enoughRed = true;
                boolean enoughGreen = true;
                boolean enoughBlue = true;
                if (colored){
                    enoughRed = red.depleteToner(pages * multiplier);
                    enoughGreen = green.depleteToner(pages * multiplier);
                    enoughBlue = blue.depleteToner(pages * multiplier);
                }

                if (!enoughBlack || !enoughRed || !enoughGreen || !enoughBlue){
                    System.out.println("Toner requires more ink before continuing. Please refill before continuing.");
                    this.checkTonerLevels();
                }else{
                    System.out.println("Printing complete.");
                }
            }
        }
    }

    public void refill(){
        blackInk.reFill(100);
        red.reFill(100);
        green.reFill(100);
        blue.reFill(100);
    }

    public void refill(String tonerName){
        switch (tonerName.toLowerCase(Locale.ROOT)){
            //case this.blackInk.getColor().toLowerCase(Locale.ROOT):
            case "black":
                blackInk.reFill(100);
                break;
            case "red":
                red.reFill(100);
                break;
            case "green":
                green.reFill(100);
                break;
            case "blue":
                blue.reFill(100);
                break;
            default:
                System.out.println("There is no such ");
                break;
        }
    }
}
