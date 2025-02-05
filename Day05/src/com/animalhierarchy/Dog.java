//Package name
package com.animalhierarchy;

//dog class extending animal class
public class Dog extends Animal {

    //constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    //overriding display method form animal class
    @Override
    public void diaplay() {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }

    //creating method to return sound
    public static String makesound() {

        return "Bhow Bhow";
    }
}
