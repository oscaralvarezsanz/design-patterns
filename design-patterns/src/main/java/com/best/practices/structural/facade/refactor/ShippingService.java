package com.best.practices.structural.facade.refactor;

public class ShippingService {
    public void calculateShipping() {
        System.out.println("Calculating shipping costs...");
    }

    public void shipOrder(String productId) {
        System.out.println("Scheduling shipping for product: " + productId);
    }
}
