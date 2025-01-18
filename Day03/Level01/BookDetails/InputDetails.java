package BookDetails;

import java.util.Scanner;

public class InputDetails {
    public static void main(String[] args) {

        //Creating scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.println("Enter the title of the book");
        String title = sc.nextLine();

        System.out.println("Enter the name of the Author of the book");
        String author = sc.nextLine();
        
        System.out.println("Enter the price of the book");
        float price= sc.nextFloat();

        //Creating object of book class and passing the instances
        Book book1 = new Book(title, author, price);

        //calling the method
        book1.details();

        //closing the scanner
        sc.close();
    }
}
