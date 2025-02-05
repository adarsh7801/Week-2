package com.schoolsystem;

// Subclass Staff to represent a staff member's specific attributes and behavior
public class Staff extends Person {
    String department; // Attribute for the staff's department

    // Constructor to initialize name, age, and department
    public Staff(String name, int age, String department) {
        super(name, age); // Call the superclass constructor
        this.department = department;
    }

    // Method to display the role and specific details of a staff member
    public void displayRole() {
        super.displayDetails(); // Call the superclass method to display common details
        System.out.println("Role: Staff");
        System.out.println("Department: " + department); // Display specific detail
    }
}
