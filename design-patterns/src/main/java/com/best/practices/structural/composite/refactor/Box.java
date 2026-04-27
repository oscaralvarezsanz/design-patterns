package com.best.practices.structural.composite.refactor;

import java.util.ArrayList;
import java.util.List;

public class Box implements DeliveryComponent {
    private List<DeliveryComponent> components = new ArrayList<>();

    public void addComponent(DeliveryComponent component) {
        components.add(component);
    }

    public double calculatePrice() {
        double total = 0;

        for (DeliveryComponent component : components) {
            total += component.calculatePrice();
        }

        return total + 2.50; 
    }
}
