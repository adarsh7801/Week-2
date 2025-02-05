//package name
package com.educationalcoursehierarchy;

//course class
public class Course {

    //initializing variables
    String courseName;
    int duration;

    //constructor
    public Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    //creating display method
    public void display(){
        System.out.println("The name of the course is "+courseName);
        System.out.println("The duration of the course is "+duration+" months");
    }

}
