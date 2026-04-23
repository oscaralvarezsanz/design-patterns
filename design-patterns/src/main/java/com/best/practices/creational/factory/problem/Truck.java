package com.best.practices.creational.factory.problem;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by land in a box.");
    }
}
