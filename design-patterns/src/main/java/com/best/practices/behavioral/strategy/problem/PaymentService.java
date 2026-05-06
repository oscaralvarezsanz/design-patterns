package com.best.practices.behavioral.strategy.problem;

public class PaymentService {
    public void processPayment(String paymentMethod, double amount) {
        if ("CREDIT_CARD".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Processing credit card payment of $" + amount);
            System.out.println("Validating card details...");
            System.out.println("Charging credit card...");
            System.out.println("Payment successful.");
        } else if ("PAYPAL".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Processing PayPal payment of $" + amount);
            System.out.println("Redirecting to PayPal...");
            System.out.println("Verifying PayPal credentials...");
            System.out.println("Payment successful.");
        } else if ("CRYPTO".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Processing Cryptocurrency payment of $" + amount);
            System.out.println("Connecting to crypto wallet...");
            System.out.println("Verifying transaction on blockchain...");
            System.out.println("Payment successful.");
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
    }
}
