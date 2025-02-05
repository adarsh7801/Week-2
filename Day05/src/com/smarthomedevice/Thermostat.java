//package name
package com.smarthomedevice;

//thermostat class extending device class
public class Thermostat extends Device{

    //initializing variable
    float tempratureSetting ;

    //consrtuctor
    public Thermostat(String deviceID, Boolean status, float tempratureSetting){
        super(deviceID, status);
        this.tempratureSetting=tempratureSetting;

    }


    //overriding displayststus method
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("The Temprature setting is "+tempratureSetting+" degree");
    }
}
