package com.classdiagrams;

import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String productName;
    private double pricePerUnit;
    private double quantity;

    public Product(String productName, double pricePerUnit, double quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Product> products;

    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(String productName, double pricePerUnit, double quantity) {
        products.add(new Product(productName, pricePerUnit, quantity));
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}

// BillGenerator Class
class BillGenerator {
    public double calculateTotal(List<Product> products) {
        double total = 0.0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }
}

// GroceryStoreBillApp Class
public class GroceryStoreBillApp {
    public static void main(String[] args) {
        // Create a Customer
        Customer customer = new Customer("Alice");

        // Add Products to the Customer's List
        customer.addProduct("Apples", 3.0, 2.0); // 2 kg at $3 per kg
        customer.addProduct("Milk", 2.0, 1.0);   // 1 liter at $2 per liter

        // Create a BillGenerator
        BillGenerator billGenerator = new BillGenerator();

        // Calculate the Total Bill
        double totalBill = billGenerator.calculateTotal(customer.getProducts());

        // Display the Bill
        System.out.println("Customer: " + customer.getName());
        System.out.println("Purchased Items:");
        for (Product product : customer.getProducts()) {
            System.out.println("- " + product.getProductName() + ": " + product.getQuantity() +
                    " units at $" + product.getPricePerUnit() + " each. Total: $" + product.getTotalPrice());
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}
