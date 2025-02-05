//package
package com.ecommerceplatform;

//clothing class extending product abstract class and implementing taxable interface
public class Clothing extends Product implements Taxable{

    //initializing variables
    private float taxRate = 12F;
    private float discount = 10F;


    //constructor
    Clothing(String productID, String productName, float price) {
        super(productID, productName, price);
    }

    //overriding method
    @Override
    float calculateDiscount() {
        return (getPrice()*discount)/100;
    }

    //overriding method
    @Override
    public float calculateTax() {
        return (getPrice()*taxRate)/100;
    }

    //overriding method
    @Override
    public String getTaxDetail() {
        return "The tax rate is \"+taxRate+\"%, from which \"+(taxRate/2)+\" is central government tax and \"+(taxRate/2)+\" is state goverment tax";
    }

    //creating method to calculate price after discount
    public float priceAfterTaxAndDiscount(){
        return (getPrice()+calculateTax()-calculateDiscount());
    }
}
