//package name
package com.animalhierarchy;

//Main class
public class AnimalHierarchy {

    //main method
    public static void main(String[] args) {

        //creating object of cat class
        Cat cat1 = new Cat("Sakshi", 2);

        //calling the methods
        System.out.println(cat1.makesound());
        cat1.diaplay();
        System.out.println();

        //creating the object of dog class
        Dog dog1 = new Dog("Pushpendra", 4);

        //calling the methods from dog class
        System.out.println(dog1.makesound());
        dog1.diaplay();
        System.out.println();

        //creating the object of bird class
        Bird bird1 = new Bird("Sher", 2);


        //calling the methods from bird class
        System.out.println(bird1.makesound());
        bird1.diaplay();


    }
}
