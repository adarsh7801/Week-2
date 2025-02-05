//package name
package com.employeemanagementsystem;

//manager class extending employee class
public class Manager extends Employee{
    int teamsize;

    //constructor
    public Manager(String name, String id, int salary, int teamsize){
        super(name, id, salary);
    }

    //overriding display details method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The team size is "+teamsize);
    }
}