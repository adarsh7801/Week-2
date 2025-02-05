package com.hybrid;

//super class
public class Person {
    String name;
    int id;

    //person constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //method to display person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
