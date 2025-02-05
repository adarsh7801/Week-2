//Package name
package com.librarymanagementsystem;

//creating parent class
public class Book {

    //initializing variables
    String title;
    int publicationYear;

    //constructor
    public Book(String title, int publicationYear) {
        this.publicationYear = publicationYear;
        this.title = title;
    }

    //creating method displayinfo
    public void displayInfo(){

        System.out.println("The title of the book is " +title);

        System.out.println("The publication year of the book is "+publicationYear);
    }
}
