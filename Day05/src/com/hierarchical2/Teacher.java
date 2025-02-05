package com.hierarchical2;

//subclass
public class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to display common person details
    @Override
    public void displayDetails() {
        // Call superclass method
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }

    // Method to display role
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}
