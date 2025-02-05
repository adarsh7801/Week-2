//package name
package com.employeemanagementsystem;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //creating object of full time employee
        FullTimeEmployee fte = new FullTimeEmployee("Abcd123456789", "Adarsh Gupta", 900000);
        fte.calculateSalary();
        fte.assignDepartment();
        fte.getDepartmentDetails();
        fte.displayDetails();

        System.out.println();

        //creating object of full time employee
        PartTimeEmployee pte = new PartTimeEmployee("Abcde12345234", "Unaiz bhoot", 1);
        pte.calculateSalary();
        pte.assignDepartment();
        pte.getDepartmentDetails();
        pte.displayDetails();

    }
}
