package InventoryItems;

//creating the class
public class Inventory {

    //initializing the variables
    String name;
    int code;
    double price;
    int quantity;

    //constructor
    public Inventory(int code, String name, double price, int quantity){
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //creating method
    public void details(){
        System.out.println("The item name is "+name+", item code is "+code+" and price is "+price+" And the total price is "+(quantity*price));
    }
}
