package com.com.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Bank Class
class Bank {
    private String bankName;
    private List<Customer> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, double initialDeposit) {
        customer.addAccount(new Account(this, initialDeposit));
        customers.add(customer);
    }

    // Display all customers
    public void displayCustomers() {
        System.out.println("Bank: " + bankName);
        if (customers.isEmpty()) {
            System.out.println("No customers available.");
        } else {
            for (Customer customer : customers) {
                System.out.println("- " + customer.getName());
            }
        }
    }

    public String getBankName() {
        return bankName;
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Account> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View all account balances
    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println("- Account in " + account.getBank().getBankName() +
                    ": $" + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

// Account Class
class Account {
    private Bank bank;
    private double balance;

    // Constructor
    public Account(Bank bank, double initialDeposit) {
        this.bank = bank;
        this.balance = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}

// Main Class to Demonstrate Association
public class BankAndCustomerApp {
    public static void main(String[] args) {
        // Create Banks
        Bank bank1 = new Bank("Global Bank");
        Bank bank2 = new Bank("City Bank");

        // Create Customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open Accounts
        bank1.openAccount(customer1, 1000.0); // Alice opens an account in Global Bank
        bank2.openAccount(customer1, 2000.0); // Alice opens another account in City Bank
        bank2.openAccount(customer2, 500.0);  // Bob opens an account in City Bank

        // View Balances
        customer1.viewBalance();
        System.out.println();
        customer2.viewBalance();
        System.out.println();

        // Display Bank Customers
        bank1.displayCustomers();
        System.out.println();
        bank2.displayCustomers();
    }
}

