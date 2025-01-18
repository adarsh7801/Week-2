package Phone;

//creating the class
public class MobilePhone {
    String brand;
    String model;
    int price;

    //constructor
    public MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //creating the method
    public void details(){
        System.out.println("The phone is of "+brand+" brand, the model of the phone is "+model+" model and the price of the phone is "+price+ " rupees");
    }
}
