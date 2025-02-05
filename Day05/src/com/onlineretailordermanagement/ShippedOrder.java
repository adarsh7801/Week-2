//package
package com.onlineretailordermanagement;

//shipped order class extending order class
public class ShippedOrder extends Order{

    //initializing variable
    long trackingNumber;

    //constructor
    public ShippedOrder(int orderId, String orderDate, long trackingNumber){

        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;

    }

    //overriding getorderstatus method from order class
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("The tracking number is "+trackingNumber);
    }
}
