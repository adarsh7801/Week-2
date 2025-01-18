// BankAccount.java
public class BankAccount {
    private String holderName;
    private int accountNumber;
    private int balance;

    // Constructor to initialize the account
    public BankAccount(String holderName, int accountNumber, int balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(int amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
