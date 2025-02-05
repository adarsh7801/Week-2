//package name
package com.educationalcoursehierarchy;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //creating object of paid online course class
        PaidOnlineCourse paid = new PaidOnlineCourse("MCA", 36, "Circle Study", true, 45000, 24.7);

        //calling method
        paid.display();
    }
}
