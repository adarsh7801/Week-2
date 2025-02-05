//package
package com.bankingsystem;

//saving account class extending bank account and implementing lonable interface
public class SavingAccount extends BankAccount implements Loanable {

    //initializing variables
    private static final double INTEREST_RATE = 0.04;

    //constructor
    public SavingAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    //overriding method
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    //method overriding
    @Override
    public boolean applyForLoan(double loanAmount) {
        return getBalance() >= loanAmount / 2; // Eligible if balance is at least half the loan amount
    }

    //method overriding
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Loan eligibility is twice the balance
    }
}
