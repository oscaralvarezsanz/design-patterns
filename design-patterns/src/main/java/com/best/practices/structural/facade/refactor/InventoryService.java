package com.best.practices.structural.facade.refactor;

public class InventoryService {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
        return true;
    }

    public void reserveProduct(String productId) {
        System.out.println("Reserving product: " + productId);
    }
}
