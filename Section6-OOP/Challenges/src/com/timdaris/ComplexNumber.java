package com.timdaris;

public class ComplexNumber {
    private double real;
    private double imaginary;

    //constructors

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //getters

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    //setters

    //custom methods

    public void add(ComplexNumber complexNumber){
        this.real += complexNumber.real;
        this.imaginary += complexNumber.imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract(ComplexNumber complexNumber){
        this.real -= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
}
