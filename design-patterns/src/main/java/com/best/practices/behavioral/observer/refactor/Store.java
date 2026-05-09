package com.best.practices.behavioral.observer.refactor;

public class Store {
    private ProductNotificationManager notificationManager;

    public Store(ProductNotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    public void addNewProduct(String productName) {
        System.out.println("\nStore: New product added - " + productName);
        notificationManager.notifySubscribers(productName);
    }
}
