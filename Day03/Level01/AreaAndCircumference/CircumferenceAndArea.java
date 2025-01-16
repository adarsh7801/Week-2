package AreaAndCircumference;

//Creating class
 public class CircumferenceAndArea {
 
    float radius;
    float pi = 22/7f;

    //Constructor
    public CircumferenceAndArea(float radius){
        this.radius = radius;
    }

    //creating method
    public void result(){
        System.out.println("The area of the circle "+(pi*radius*radius));
        System.out.println("The circumference of the circle is "+(2*pi*pi));
    }
 }