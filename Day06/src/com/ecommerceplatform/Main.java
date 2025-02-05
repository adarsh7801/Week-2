//package
package com.ecommerceplatform;

//creating main class
public class Main {

    //creating main method
    public static void main(String[] args) {

        //creating object of Electronics class
        Eletronics fan = new Eletronics("ABC12A34253", "Ceiling Fan", 2998.5f);

        //calling methods
        System.out.println("The name of the product is "+fan.getProductName());
        System.out.println("The discount is "+fan.calculateDiscount());
        System.out.println("The tax is "+fan.calculateTax());
        System.out.println(fan.getTaxDetail());
        System.out.println("Total price after tax and discount is "+fan.priceAfterTaxAndDiscount());


        System.out.println();

        //creating object of Electronics class
        Clothing shirt = new Clothing("ABCHFKK12674839", "Check Shirt", 450);

        //calling methods
        System.out.println("The name of the product is "+shirt.getProductName());
        System.out.println("The discount is "+shirt.calculateDiscount());
        System.out.println("The tax is "+shirt.calculateTax());
        System.out.println(shirt.getTaxDetail());
        System.out.println("Total price after tax and discount is "+shirt.priceAfterTaxAndDiscount());

        System.out.println();

        //creating object of Electronics class
        Grocceries nivea = new Grocceries("DHYAKDU74831034", "Nivea Mosturizer", 110);

        //calling methods
        System.out.println("The name of the product is "+nivea.getProductName());
        System.out.println("The discount is "+nivea.calculateDiscount());
        System.out.println("The tax is "+nivea.calculateTax());
        System.out.println(nivea.getTaxDetail());
        System.out.println("Total price after tax and discount is "+nivea.priceAfterTaxAndDiscount());

    }
}
