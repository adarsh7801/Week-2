package com.schoolsystem;

// Subclass Student to represent a student's specific attributes and behavior
public class Student extends Person {
    String grade; // Attribute for the student's grade

    // Constructor to initialize name, age, and grade
    public Student(String name, int age, String grade) {
        super(name, age); // Call the superclass constructor
        this.grade = grade;
    }

    // Method to display the role and specific details of a student
    public void displayRole() {
        super.displayDetails(); // Call the superclass method to display common details
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade); // Display specific detail
    }
}
