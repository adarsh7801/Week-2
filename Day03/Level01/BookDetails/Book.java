package BookDetails;

public class Book {

    //declaring the variables
    String title;
    String author;
    float price;

    //constructor
    public Book(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //method
    public void details(){
        System.out.println("The title of the book is "+title);
        System.out.println("The Name of the Author is "+author);
        System.out.println("The price is "+price);
    }
}
