//package name
package com.employeemanagementsystem;

//class name
public class Main {
    //main method
    public static void main(String[] args) {

        //creating object of manager manager class
        Manager itmanager = new Manager("Adarsh Gupta", "0111CA231002", 100000000, 19);
        System.out.println("Manager");
        itmanager.displayDetails();

        System.out.println();

        //creating objrct of developer class
        Developer javadeveloper = new Developer("Sakshi", "0111CA231050", 5, "JAVA");
        System.out.println("Developer");
        javadeveloper.displayDetails();

        System.out.println();

        //creating object of intern class
        Intern pythonintern = new Intern("Unaiz", "0191CA231102", 1000);
        System.out.println("Intern");
        pythonintern.displayDetails();
    }
}
