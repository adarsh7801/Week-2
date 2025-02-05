//package name
package com.smarthomedevice;

//class
public class Device {

    //initializing variables
    String deviceID;
    Boolean status;
    String onoff;

    //constructor
    public Device(String deviceID, Boolean status){
        this.deviceID= deviceID;
        this.status=status;
    }

    //displayStatus method
    public void displayStatus(){
        System.out.println("Device id = "+deviceID);
        if (status){
            onoff = "On";
        }
        System.out.println("Device Status = "+onoff);
    }
}
