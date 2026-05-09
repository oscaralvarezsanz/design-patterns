package com.best.practices.behavioral.observer.refactor;

public class App {
    public static void main(String[] args) {
        ProductNotificationManager productNotificationManager = new ProductNotificationManager();
        
        EmailProductNotifier emailProductNotifier = new EmailProductNotifier();
        MobileAppProductNotifier mobileAppProductNotifier = new MobileAppProductNotifier();
        
        productNotificationManager.subscribe(emailProductNotifier);
        productNotificationManager.subscribe(mobileAppProductNotifier);
        
        Store store = new Store(productNotificationManager);
        store.addNewProduct("Laptop");
    }
}
