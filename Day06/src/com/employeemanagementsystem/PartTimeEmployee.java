//package name
package com.employeemanagementsystem;

//full time employee class extending employee class and implementing department class
public class PartTimeEmployee extends Employee implements Department{

    //constructor
    public PartTimeEmployee(String employeeId, String name, int baseSalary){
        super(employeeId, name, baseSalary);
    }

    //overriding method
    @Override
    public void calculateSalary(){
        System.out.println("The salary is "+baseSalary);
    }

    //overriding method
    @Override
    public void assignDepartment(){
        System.out.println("The department is cleaning");
    }

    //overriding method
    @Override
    public void getDepartmentDetails() {
        System.out.println("The department is not working properly");
    }
}
