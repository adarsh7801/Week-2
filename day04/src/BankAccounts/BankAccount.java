package BankAccounts;

// Parent class: BankAccount
public class BankAccount {
    // Instance variables
    public String accountNumber;  // public: can be accessed from anywhere
    protected String accountHolder; // protected: can be accessed within the same package or by subclasses
    private double balance;  // private: can only be accessed within this class

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance (getter)
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance (setter)
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}
