//package
package com.smarthomedevice;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //creating object of thermostat class
        Thermostat thermostat1 = new Thermostat("ABCD12345", true, 30);

        //calling method
        thermostat1.displayStatus();;

    }
}
