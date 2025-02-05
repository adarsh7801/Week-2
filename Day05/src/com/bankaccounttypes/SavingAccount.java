//package
package com.bankaccounttypes;

//saving  account extending bank account class
public class SavingAccount extends BankAccount{


    //initializing variables
    float intrestRate = 24;
    int withdrawalLimit = 1000000;

    //constructor
    public SavingAccount(String accountNumber, float balance){
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
