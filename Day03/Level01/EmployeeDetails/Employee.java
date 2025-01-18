package EmployeeDetails;
//creating the class
public class Employee {
    String name;
    int id;
    int salary;

    //constructor
    public Employee(String name, int id, int salary){
        this.name= name;
        this.id = id;
        this.salary = salary;
    }

    //method
    public void displayDetails(){
        System.out.println("Name = "+name);
        System.out.println("id = "+id);
        System.out.println("Salary  = "+salary);
    }
    
}