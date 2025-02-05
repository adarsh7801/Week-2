package com.hierarchical2;

public class Student extends Person {
    String grade;

    // Constructor for Student
    public Student(String name, int age, String grade) {
        super(name, age); // Call to the superclass constructor
        this.grade = grade;
    }

    // Override displayRole
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    // Display additional details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}
