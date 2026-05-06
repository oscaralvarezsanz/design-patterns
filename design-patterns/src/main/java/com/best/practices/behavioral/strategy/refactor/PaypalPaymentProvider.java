package com.best.practices.behavioral.strategy.refactor;

import org.springframework.stereotype.Component;

@Component
public class PaypalPaymentProvider implements PaymentProvider {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("Redirecting to PayPal...");
        System.out.println("Verifying PayPal credentials...");
        System.out.println("Payment successful.");
    }

    @Override
    public PaymentType getType() {
        return PaymentType.PAYPAL;
    }
}
