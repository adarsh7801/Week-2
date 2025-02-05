//package
package com.onlineretailordermanagement;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //creating object of delivered class
        DeliveredOrder delivered = new DeliveredOrder(12345678, "07/08/2025", 123456466, "07/12/2015");

        //calling getorderstatus method
        delivered.getOrderStatus();
    }

}
