//package
package com.educationalcoursehierarchy;

//paid online course class extending online course class
public class PaidOnlineCourse extends OnlineCourse{

    //initializing variables
    int fee;
    double discount;

    //constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, Boolean isRecorded, int fee, double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    //overriding display method from onlind course class
    @Override
    public void display() {
        super.display();
        System.out.println("The Fee of the course is "+fee);
        System.out.println("The discount of the course is "+discount+"%");
    }
}
