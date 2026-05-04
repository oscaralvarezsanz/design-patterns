package com.best.practices.structural.facade.problem;

public class OrderApp {
    public static void main(String[] args) {
        String productId = "PROD-12345";
        String accountId = "ACC-98765";
        String email = "customer@example.com";
        double amount = 150.00;

        System.out.println("Starting order placement process...");

        // Client has to interact with multiple complex subsystems directly
        InventorySystem inventory = new InventorySystem();
        PaymentSystem payment = new PaymentSystem();
        ShippingSystem shipping = new ShippingSystem();
        NotificationSystem notification = new NotificationSystem();

        if (inventory.checkStock(productId)) {
            inventory.reserveProduct(productId);
            boolean paymentSuccess = payment.processPayment(accountId, amount);

            if (paymentSuccess) {
                shipping.calculateShipping();
                shipping.shipOrder(productId);
                notification.sendEmail(email, "Your order for " + productId + " has been shipped!");
                System.out.println("Order placed successfully.");
            } else {
                notification.sendEmail(email, "Payment failed for your order.");
                System.out.println("Order placement failed due to payment issue.");
            }
        } else {
            notification.sendEmail(email, "Sorry, the product is out of stock.");
            System.out.println("Order placement failed due to out of stock.");
        }
    }
}
