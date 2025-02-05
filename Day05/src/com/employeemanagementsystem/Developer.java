//package name
package com.employeemanagementsystem;

//developer class extending smployee class
public class Developer extends  Employee{

    String programminglanguage;

    //constructor
    public Developer(String name, String id, int salary, String programminglanguage){
        super(name, id, salary);
    }

    //overriding display details method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The Developer is "+programminglanguage+" Developer");
    }
}
