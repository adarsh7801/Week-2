//package
package com.onlineretailordermanagement;

//shipped delivered order class extending shipped order class
public class DeliveredOrder extends ShippedOrder{

    //initializing variables
    String deliveryDate;

    //constructor
    public DeliveredOrder(int orderId, String orderDate, long trackingNumber, String deliveryDate){

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;

    }

    //overriding method from shipped order class
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("The Delivery date is "+deliveryDate);
    }
}
