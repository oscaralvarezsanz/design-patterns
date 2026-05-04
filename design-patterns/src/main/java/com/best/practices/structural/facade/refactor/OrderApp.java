package com.best.practices.structural.facade.refactor;

public class OrderApp {
    public static void main(String[] args) {
        String productId = "PROD-12345";
        String accountId = "ACC-98765";
        String email = "customer@example.com";
        double amount = 150.00;

        System.out.println("Starting order placement process with Facade...");

        OrderFacade orderFacade = new OrderFacade();
        // TODO: Use the orderFacade to place the order
    }
}
