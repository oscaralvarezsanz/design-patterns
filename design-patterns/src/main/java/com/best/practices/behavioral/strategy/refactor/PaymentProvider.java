package com.best.practices.behavioral.strategy.refactor;

public interface PaymentProvider {
    void pay(double amount);
    PaymentType getType();
}
