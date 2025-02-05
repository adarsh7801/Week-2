package BankAccounts;

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);  // Call the parent class constructor
    }

    // Method to display Savings account details (demonstrating the use of access modifiers)
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);  // Can access public variable from parent class
        System.out.println("Account Holder: " + accountHolder);  // Can access protected variable from parent class
        System.out.println("Balance: $" + getBalance());  // Access private balance through the public getter
    }
}
