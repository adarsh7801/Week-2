package com.hierarchical2;

public class Staff extends Person {
    String department;

    // Constructor for Staff
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Override displayRole
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    // Display additional details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Department: " + department);
    }
}
