//package name
package com.employeemanagementsystem;

//employee class
abstract class Employee {

    //initializing variables
    String employeeId;
    String name;
    int baseSalary;

    //constructor
    public Employee(String employeeId, String name, int baseSalary){
        this.baseSalary = baseSalary;
        this.employeeId = employeeId;
        this.name = name;
    }

    //abstract method
    abstract void calculateSalary();

    /* public void setBaseSalary(int baseSalary){
        this.baseSalary= baseSalary;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }*/

    //display details method
    public void displayDetails(){
        System.out.println("The Employee id is "+employeeId);
        System.out.println("The name of the employee is "+name);
        //System.out.println("The base salary of the Employee is "+baseSalary);
    }


}