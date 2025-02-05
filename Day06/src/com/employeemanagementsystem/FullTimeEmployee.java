//package name
package com.employeemanagementsystem;

//full time employee class extending employee class and implementing department class
public class FullTimeEmployee extends Employee implements Department{

    //constructor
    public  FullTimeEmployee(String employeeId, String name, int baseSalary){
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
        System.out.println("The department is Testing bugs");
    }

    //overriding method
    @Override
    public void getDepartmentDetails() {
        System.out.println("The department is working properly");
    }
}
