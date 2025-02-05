package com.schoolsystem;

// Superclass Person to represent common attributes and behavior of all roles
public class Person {
    String name;  // Common attribute for name
    int age;      // Common attribute for age

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display common details of a person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
