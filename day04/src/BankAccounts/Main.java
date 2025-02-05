package BankAccounts;

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account1 = new BankAccount("1234567890", "John Doe", 5000.00);

        // Display account details using the public method
        System.out.println("Account 1 Details:");
        account1.displayAccountDetails();

        // Modify balance using public setter method
        account1.setBalance(6000.00);
        System.out.println("\nAccount 1 Details After Balance Update:");
        account1.displayAccountDetails();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("9876543210", "Alice Smith", 10000.00);

        // Display Savings Account details
        System.out.println("\nSavings Account Details:");
        savingsAccount.displaySavingsAccountDetails();
    }
}
