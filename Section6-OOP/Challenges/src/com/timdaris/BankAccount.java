package com.timdaris;

public class BankAccount {
    //fields
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //constructor

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //getters

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    //setters

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //custom methods
    public void depositFunds(double funds){
        balance += funds;
        System.out.println("Deposit successful. Your new balance: " + balance);
    }

    public void withdrawal(double amount){
        if (balance - amount < 0){
            System.out.println("You cannot withdraw the desired amount. Current balance: " + balance);
        }else{
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance: " + balance);
        }

    }
}
