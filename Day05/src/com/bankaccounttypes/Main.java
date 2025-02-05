//package
package com.bankaccounttypes;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //creating object of checking account
        CheckingAccount chk = new CheckingAccount("ABAC5783974", 7000);
        chk.displayAccountType();

        //creating object of fixed deposite account
        FixeddepositeAccount fd = new FixeddepositeAccount("ABCD12345678", 100000);
        fd.displayAccountType();

        //creating object of saving account
        SavingAccount sa = new SavingAccount("FGSH123456712", 1200000);
        sa.displayAccountType();
    }
}
