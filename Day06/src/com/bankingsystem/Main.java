//package name
package com.bankingsystem;

//importing scanner class
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //creating objects of the sub classes
        SavingAccount sa = new SavingAccount("SA123", "John Doe", 5000);
        CurrentAccount ca = new CurrentAccount("CA456", "Jane Smith", 10000);


        System.out.println("Select an account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();

        //taking input for account type
        BankAccount account;
        if (choice == 1) {
            account = sa;
            System.out.println("Savings Account selected.");
        } else if (choice == 2) {
            account = ca;
            System.out.println("Current Account selected.");
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        //polymorphism
        System.out.println("Account Holder: " + account.getHolderName());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Calculated Interest: " + account.calculateInterest());

        if (account instanceof Loanable) {
            Loanable loanable = (Loanable) account;
            System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
        }

        //closing scanner
        sc.close();
    }
}
