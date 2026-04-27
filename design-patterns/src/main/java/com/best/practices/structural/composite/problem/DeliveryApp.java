package com.best.practices.structural.composite.problem;

public class DeliveryApp {
    public static void main(String[] args) {
        Box mainBox = new Box();

        Box electronicsBox = new Box();
        electronicsBox.addProduct(new Product("Laptop", 1200.0));
        electronicsBox.addProduct(new Product("Mouse", 25.0));

        Box accessoriesBox = new Box();
        accessoriesBox.addProduct(new Product("Charger", 45.0));
        
        mainBox.addBox(electronicsBox);
        mainBox.addBox(accessoriesBox);
        mainBox.addProduct(new Product("Receipt", 0.0));

        System.out.println("Total price: " + mainBox.calculatePrice());
    }
}
