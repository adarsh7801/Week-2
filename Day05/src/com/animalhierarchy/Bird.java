//package name
package com.animalhierarchy;

//bird class extending animal class
public class Bird extends Animal {

    //consturctor
    public Bird(String name, int age) {
        super(name, age);
    }

    //overriding method from animal class
    @Override
    public void diaplay() {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }

    //creating method to make sound
    public static String makesound() {
        return "Cukdoo koo";
    }
}
