// Package declaration
package com.ridehailing;

// Interface GPS to manage the vehicle's location
public interface GPS {

    // Method to get the current location of the vehicle
    String getCurrentLocation();

    // Method to update the current location of the vehicle
    void updateLocation(String location);
}
