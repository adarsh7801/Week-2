package com.hierarchical2;

//super class
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display common person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to display role (to be overridden by subclasses)
    public void displayRole() {
        System.out.println("Generic Person");
    }
}
