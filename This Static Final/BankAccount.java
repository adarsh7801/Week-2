class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0; // Keeps track of total accounts created

    // Instance variables
    private String accountHolderName;
    private final int accountNumber; // Final variable, cannot be modified after initialization
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountHolderName, int accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName; // Resolving ambiguity using 'this'
        this.accountNumber = accountNumber; // Final variable initialized here
        this.balance = initialDeposit;
        totalAccounts++; // Increment total accounts whenever a new account is created
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) { // Check if the object is an instance of BankAccount
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating accounts
        BankAccount account1 = new BankAccount("John Doe", 1001, 500.0);
        BankAccount account2 = new BankAccount("Jane Smith", 1002, 1000.0);

        // Display account details
        account1.displayAccountDetails();
        System.out.println();

        account2.displayAccountDetails();
        System.out.println();

        // Perform transactions
        account1.deposit(200.0);
        account1.withdraw(100.0);

        // Display updated details
        account1.displayAccountDetails();
        System.out.println();

        // Static method usage
        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
    }
}
