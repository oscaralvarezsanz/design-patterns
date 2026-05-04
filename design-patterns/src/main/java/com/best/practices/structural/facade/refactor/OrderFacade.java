package com.best.practices.structural.facade.refactor;

import com.best.practices.structural.facade.problem.*;

public class OrderFacade {
    private InventorySystem inventory;
    private PaymentSystem payment;
    private ShippingSystem shipping;
    private NotificationSystem notification;

    public OrderFacade() {
        this.inventory = new InventorySystem();
        this.payment = new PaymentSystem();
        this.shipping = new ShippingSystem();
        this.notification = new NotificationSystem();
    }

    // TODO: Implement a method to place an order that encapsulates the complex subsystem interactions
}
