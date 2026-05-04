package com.best.practices.structural.facade.refactor;

public class OrderApp {

    public static void main(String[] args) {
        String productId = "PROD-12345";
        String accountId = "ACC-98765";
        String email = "customer@example.com";
        double amount = 150.00;

        System.out.println("Starting order placement process...");

        OrderFacade orderFacade = new OrderFacade(
                new InventoryService(),
                new PaymentService(),
                new ShippingService(),
                new NotificationService()
        );

        OrderService orderService = new OrderService(orderFacade);
        orderService.placeOrder(productId, accountId, email, amount);
    }
}
