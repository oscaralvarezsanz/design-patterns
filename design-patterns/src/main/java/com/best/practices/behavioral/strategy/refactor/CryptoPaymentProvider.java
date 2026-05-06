package com.best.practices.behavioral.strategy.refactor;

import org.springframework.stereotype.Component;

@Component
public class CryptoPaymentProvider implements PaymentProvider {
    @Override
    public void pay(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
        System.out.println("Connecting to crypto wallet...");
        System.out.println("Verifying transaction on blockchain...");
        System.out.println("Payment successful.");
    }

    @Override
    public PaymentType getType() {
        return PaymentType.CRYPTO;
    }
}