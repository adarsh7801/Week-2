//package
package com.bankaccounttypes;

//fixed deposite account extending bank account class
public class FixeddepositeAccount extends BankAccount{

    //initializing variables
    float intrestRate = 12;
    int withdrawalLimit = 20000;

    //constructor
    public FixeddepositeAccount(String accountNumber, float balance){
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
