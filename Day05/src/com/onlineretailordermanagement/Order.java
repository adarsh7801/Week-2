//package
package com.onlineretailordermanagement;

//order class
public class Order {

    //initializing variables
    int orderId;
    String orderDate;

    // constructor
    public Order(int orderId, String orderDate){
        this.orderDate = orderDate;
        this.orderId= orderId;
    }

    //creating method
    public void getOrderStatus(){
        System.out.println("The order id is "+orderId);
        System.out.println("Thee order date is "+orderDate);
    }

}
