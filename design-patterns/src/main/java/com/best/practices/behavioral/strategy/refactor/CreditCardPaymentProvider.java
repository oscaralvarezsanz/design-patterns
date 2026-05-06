package com.best.practices.behavioral.strategy.refactor;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentProvider implements PaymentProvider {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Validating card details...");
        System.out.println("Charging credit card...");
        System.out.println("Payment successful.");
    }

    @Override
    public PaymentType getType() {
        return PaymentType.CREDIT_CARD;
    }
}
