package com.best.practices.behavioral.observer.problem;

public class App {
    public static void main(String[] args) {
        Store store = new Store();
        
        store.addNewProduct("iPhone 16 Pro");
        store.addNewProduct("MacBook Air M3");
    }
}
