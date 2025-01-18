package EmployeeDetails;

import java.util.Scanner;

//main class
public class EmployeeDetails{
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input for name
        System.out.println("Enter the name");
        String name= sc.nextLine();

        //taking input for id
        System.out.println("Enter the id");
        int id = sc.nextInt();

        //taking input for salary
        System.out.println("Enter the salary");
        int salary = sc.nextInt();

        //creating object of employee class and passing the variables to it
        Employee employee1 = new Employee(name, id, salary);

        //calling display details method
        employee1.displayDetails();

        //closing the scanner
        sc.close();
    }
}