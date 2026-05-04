package com.best.practices.structural.facade.problem;

public class ShippingSystem {
    public void calculateShipping() {
        System.out.println("Calculating shipping costs...");
    }

    public void shipOrder(String productId) {
        System.out.println("Scheduling shipping for product: " + productId);
    }
}
