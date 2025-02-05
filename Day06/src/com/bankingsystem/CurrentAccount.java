//package
package com.bankingsystem;

//saving account class extending bank account and implementing lonable interface
public class CurrentAccount extends BankAccount implements Loanable {

    //initializing variables
    private static final double INTEREST_RATE = 0.02;
    private static final double OVERDRAFT_LIMIT = 50000;

    //constructor
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    //method overriding
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    //method overriding
    @Override
    public boolean applyForLoan(double loanAmount) {
        return getBalance() + OVERDRAFT_LIMIT >= loanAmount; // Eligible if balance + overdraft covers the loan
    }

    //method overriding
    @Override
    public double calculateLoanEligibility() {
        return getBalance() + OVERDRAFT_LIMIT; // Loan eligibility includes overdraft limit
    }
}
