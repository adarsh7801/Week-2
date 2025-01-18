package AreaAndCircumference;

import java.util.Scanner;

//creating main class
public class CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {

        //Creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();

        //creating object of class
        CircumferenceAndArea CircumferenceAndArea1 = new CircumferenceAndArea(radius);

        //calling the method
        CircumferenceAndArea1.result();
        
        sc.close();
    }
}
