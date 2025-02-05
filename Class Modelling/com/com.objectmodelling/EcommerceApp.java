package com.com.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}

// Order Class
class Order {
    private String orderId;
    private List<Product> products;

    // Constructor
    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Getter for orderId
    public String getOrderId() {
        return orderId;
    }

    // Method to add products to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to calculate the total price of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println(" - " + product.getName() + ": $" + product.getPrice());
        }
        System.out.println("Total price: $" + calculateTotal());
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Order> orders;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order with Order ID: " + order.getOrderId());
    }

    // Display all orders placed by the customer
    public void displayOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

// Main Class to Demonstrate Communication and Aggregation
public class EcommerceApp {
    public static void main(String[] args) {
        // Create Products
        Product laptop = new Product("Laptop", 1200);
        Product smartphone = new Product("Smartphone", 800);
        Product headphones = new Product("Headphones", 150);

        // Create a Customer
        Customer customer1 = new Customer("Alice");

        // Create an Order for the customer
        Order order1 = new Order("ORD001");

        // Add Products to the Order
        order1.addProduct(laptop);
        order1.addProduct(headphones);

        // Customer places the order
        customer1.placeOrder(order1);

        // Create another Order for the customer
        Order order2 = new Order("ORD002");

        // Add Products to the second Order
        order2.addProduct(smartphone);

        // Customer places the second order
        customer1.placeOrder(order2);

        // Display all orders placed by the customer
        customer1.displayOrders();
    }
}
