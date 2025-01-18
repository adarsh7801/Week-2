import java.util.Scanner;

// Main class to simulate ATM
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for account creation
        System.out.println("Enter the name of the account holder:");
        String holderName = sc.nextLine();
        System.out.println("Enter the account number:");
        int accountNumber = sc.nextInt();
        System.out.println("Enter the initial balance:");
        int balance = sc.nextInt();

        // Creating a BankAccount object
        BankAccount account = new BankAccount(holderName, accountNumber, balance);

        // Menu-driven program
        while (true) {
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Deposit Money
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    account.displayBalance();
                    break;
                case 2: // Withdraw Money
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    account.displayBalance();
                    break;
                case 3: // Display Balance
                    account.displayBalance();
                    break;
                case 4: // Exit
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
