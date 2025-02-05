//package
package com.ecommerceplatform;

//abstract class product
abstract class Product {
    private String productID;
    private String productName;
    private float price;

    //constructor
    Product(String productID, String productName, float price){
        this.productID = productID;
        this.productName = productName;
        this.price = price;

    }

    //getter and setter
    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    //Abstract method
    abstract float calculateDiscount();


    //method
    public float calculateFinalPrice(){
        return 0;
    }

}
