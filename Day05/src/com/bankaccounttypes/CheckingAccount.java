//package
package com.bankaccounttypes;

//checking account extending bank account class
public class CheckingAccount extends BankAccount{

    //initializing variables
    float intrestRate = 16;
    int withdrawalLimit = 100000;

    //constructor
    public CheckingAccount(String accountNumber, float balance){
        super(accountNumber, balance);
    }

    //overriding display account type method
    @Override
    public void displayAccountType() {
        System.out.println("The account type is Checking Account");
        super.displayAccountType();
        System.out.println("The Intrest rate is "+intrestRate+" %");
        System.out.println("The withdrawal limit is "+withdrawalLimit);
        System.out.println();
    }
}
