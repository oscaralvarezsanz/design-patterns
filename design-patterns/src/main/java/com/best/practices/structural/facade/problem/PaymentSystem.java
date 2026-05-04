package com.best.practices.structural.facade.problem;

public class PaymentSystem {
    public boolean processPayment(String accountId, double amount) {
        System.out.println("Processing payment of $" + amount + " for account: " + accountId);
        return true;
    }
}
