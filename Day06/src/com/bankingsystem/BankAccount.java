//package
package com.bankingsystem;

//abstract class bank account
abstract class BankAccount {

    //initializing variables
    private String accountNumber;
    private String holderName;
    private double balance;

    //constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    //method
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        return balance;
    }

    //method
    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
        return balance;
    }

    //getter for balance
    public double getBalance() {
        return balance;
    }

    //getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    //getter for holder name
    public String getHolderName() {
        return holderName;
    }

    //abstract method
    abstract double calculateInterest();
}
