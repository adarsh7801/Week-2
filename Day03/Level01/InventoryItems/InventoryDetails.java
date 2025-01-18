package InventoryItems;
import java.util.Scanner;

//creating main class
public class InventoryDetails {
    public static void main(String[] args) {

        //Creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter the Item Code");
        int code = sc.nextInt();

        System.out.println("Enter the Item Name");
        String name = sc.next();

        System.out.println("Enter the price");
        double price = sc.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();

        //Creating the object of class
        Inventory inventory1 = new Inventory(code, name, price, quantity);

        //calling the method
        inventory1.details();

        //closing the scanner
        sc.close();
    }
}
