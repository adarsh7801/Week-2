//package name
package com.animalhierarchy;

//cat class extending animal class
public class Cat extends Animal {

    //constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    //overriding
    @Override
    public void diaplay() {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }

    //creating method to make sound
    public static String makesound() {

        return "Meow Meow";
    }
}
