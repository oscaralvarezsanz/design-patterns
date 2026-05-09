package com.best.practices.behavioral.observer.problem;

public class Store {
    private EmailService emailService;
    private MobileAppService mobileAppService;

    public Store() {
        // The store is tightly coupled to concrete notification services
        this.emailService = new EmailService();
        this.mobileAppService = new MobileAppService();
    }

    public void addNewProduct(String productName) {
        System.out.println("\nStore: New product added - " + productName);
        
        // Hardcoded notification logic
        emailService.sendEmail("New product available: " + productName);
        mobileAppService.sendPushNotification("Check out our new " + productName + "!");
    }
}
