package com.schoolsystem;

// Subclass Teacher to represent a teacher's specific attributes and behavior
public class Teacher extends Person {
    String subject; // Attribute for the subject the teacher specializes in

    // Constructor to initialize name, age, and subject
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the superclass constructor
        this.subject = subject;
    }

    // Method to display the role and specific details of a teacher
    public void displayRole() {
        super.displayDetails(); // Call the superclass method to display common details
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject); // Display specific detail
    }
}
