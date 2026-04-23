package com.best.practices.creational.factory.problem;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver by sea in a container.");
    }
}
