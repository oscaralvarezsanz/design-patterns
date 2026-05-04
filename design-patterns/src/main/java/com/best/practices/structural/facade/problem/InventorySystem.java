package com.best.practices.structural.facade.problem;

public class InventorySystem {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
        return true;
    }

    public void reserveProduct(String productId) {
        System.out.println("Reserving product: " + productId);
    }
}
