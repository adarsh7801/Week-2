//package
package com.educationalcoursehierarchy;

//onlinecourse class extending course class
public class OnlineCourse extends Course{

    //initializing variables
    String platform;
    Boolean isRecorded;

    //constructor
    public OnlineCourse(String courseName, int duration, String platform, Boolean isRecorded){

        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;

    }

    //overriding display method from course class
    @Override
    public void display() {
        super.display();
        System.out.println("The course is available on "+platform+" platform");

        if (isRecorded){
            System.out.println("The course is recorded");
        }
        else {
            System.out.println("The course is not recorded");
        }

    }
}
