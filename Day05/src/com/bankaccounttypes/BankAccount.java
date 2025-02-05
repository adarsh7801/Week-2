//package name
package com.bankaccounttypes;

//creating bank account class
public class BankAccount {

    //initializing variables
    String accountNumber;
    float balance;

    //constructor
    public BankAccount(String accountNumber, float balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //creating method display account type
    public void displayAccountType(){
        System.out.println("The account number is " +accountNumber);
        System.out.println("The account balance is "+balance);
    }
}
