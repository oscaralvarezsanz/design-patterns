package com.best.practices.structural.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Product> products = new ArrayList<>();
    private List<Box> boxes = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public double calculatePrice() {
        double total = 0;
        // Sum price of direct products
        for (Product product : products) {
            total += product.getPrice();
        }
        // Sum price of nested boxes
        for (Box box : boxes) {
            total += box.calculatePrice();
        }
        // Add packaging cost
        return total + 2.50; 
    }
}
