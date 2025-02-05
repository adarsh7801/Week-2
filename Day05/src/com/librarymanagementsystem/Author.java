//package name
package com.librarymanagementsystem;

//Author class extending book class
public class Author extends Book{

    //initializing variables
    String authorName;

    //constructor
    public Author(String title, int publicationYear, String authorName){
        super(title,publicationYear);
        this.authorName= authorName;
    }

    //overriding displayinfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The Author Name is "+authorName);
    }
}
