//package name
package com.employeemanagementsystem;

//employee class
public class Employee {

    //initializing variables
    String name;
    String id;
    int salary;

    //constructor
    public Employee(String name, String id, int salary){
        this.name = name;
        this.id= id;
        this.salary= salary;
    }

    //creating method display details
    public void displayDetails(){

        System.out.println("The name is  "+name);
        System.out.println("The id is   "+id);
        System.out.println("The salary is   "+salary);
    }


}
