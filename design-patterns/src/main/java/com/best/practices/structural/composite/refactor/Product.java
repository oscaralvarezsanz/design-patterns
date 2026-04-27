package com.best.practices.structural.composite.refactor;

public class Product implements DeliveryComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
