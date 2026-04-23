package com.best.practices.creational.factory.problem;

public class LogisticsApp {

    public void planDelivery(String transportType) {
        Transport transport;
        
        // CODE SMELL: Hardcoded conditional logic for object creation.
        // This violates the Open/Closed Principle because every time a new
        // transport type is added, this class must be modified.
        if ("truck".equalsIgnoreCase(transportType)) {
            transport = new Truck();
        } else if ("ship".equalsIgnoreCase(transportType)) {
            transport = new Ship();
        } else {
            throw new IllegalArgumentException("Unknown transport type: " + transportType);
        }
        
        transport.deliver();
    }
}
