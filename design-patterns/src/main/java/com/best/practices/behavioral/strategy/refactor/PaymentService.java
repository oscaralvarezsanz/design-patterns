package com.best.practices.behavioral.strategy.refactor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private List<PaymentProvider> paymentProviders;

    public PaymentService(List<PaymentProvider> paymentProviders) {
        this.paymentProviders = paymentProviders;
    }

    public void processPayment(double amount, PaymentType type) {
        PaymentProvider paymentProvider = paymentProviders.stream()
                .filter(provider -> provider.getType() == type)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Payment method not found: " + type));

        paymentProvider.pay(amount);
    }
}