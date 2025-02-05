//package
package com.ecommerceplatform;

//grocceries class extending product abstract class and implementing taxable interface
public class Grocceries extends Product implements  Taxable{


    //initializing variables
    private float taxRate = 24F;
    private float discount = 17F;

    //constructor
    Grocceries(String productID, String productName, float price) {
        super(productID, productName, price);
    }

    //overriding method
    @Override
    public float calculateDiscount() {

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
        return "The tax rate is "+taxRate+"%, from which "+(taxRate/2)+" is central government tax and "+(taxRate/2)+" is state goverment tax";
    }

    //creating method to calculate price after discount
    public float priceAfterTaxAndDiscount(){
        return (getPrice()+calculateTax()-calculateDiscount());
    }
}
