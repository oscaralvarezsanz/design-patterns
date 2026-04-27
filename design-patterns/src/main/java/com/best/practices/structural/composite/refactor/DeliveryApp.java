package com.best.practices.structural.composite.refactor;

public class DeliveryApp {
    public static void main(String[] args) {
        Box mainBox = new Box();

        Box electronicsBox = new Box();
        electronicsBox.addComponent(new Product("Laptop", 1200.0));
        electronicsBox.addComponent(new Product("Mouse", 25.0));

        Box accessoriesBox = new Box();
        accessoriesBox.addComponent(new Product("Charger", 45.0));
        
        mainBox.addComponent(electronicsBox);
        mainBox.addComponent(accessoriesBox);
        mainBox.addComponent(new Product("Receipt", 0.0));

        System.out.println("Total price: " + mainBox.calculatePrice());
    }
}
