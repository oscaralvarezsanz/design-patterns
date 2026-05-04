package com.best.practices.structural.facade.refactor;

public class OrderService {
    private OrderFacade orderFacade;
    
    public OrderService(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    public void placeOrder(String productId, String accountId, String email, double amount) {
        System.out.println("Starting order placement process with Facade...");

        orderFacade.placeOrder(productId, accountId, email, amount);
    }
}
