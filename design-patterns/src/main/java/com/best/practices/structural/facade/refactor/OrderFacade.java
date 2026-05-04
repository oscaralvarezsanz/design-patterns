package com.best.practices.structural.facade.refactor;

public class OrderFacade {
    private InventoryService inventory;
    private PaymentService payment;
    private ShippingService shipping;
    private NotificationService notification;

    public OrderFacade(InventoryService inventory,
                       PaymentService payment,
                       ShippingService shipping,
                       NotificationService notification) {
        this.inventory = inventory;
        this.payment = payment;
        this.shipping = shipping;
        this.notification = notification;
    }

    public void placeOrder(String productId, String accountId, String email, double amount){
        if(!inventory.checkStock(productId)){
            notification.sendEmail(email, "Sorry, the product is out of stock.");
            System.out.println("Order placement failed due to out of stock.");
            return;
        }
        inventory.reserveProduct(productId);
        if (!payment.processPayment(accountId, amount)){
            notification.sendEmail(email, "Payment failed for your order.");
            System.out.println("Order placement failed due to payment issue.");
            return;
        }
        shipping.calculateShipping();
        shipping.shipOrder(productId);
        notification.sendEmail(email, "Your order for " + productId + " has been shipped!");
        System.out.println("Order placed successfully.");
    }
}
