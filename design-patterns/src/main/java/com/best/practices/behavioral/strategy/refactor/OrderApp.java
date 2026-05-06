package com.best.practices.behavioral.strategy.refactor;

public class OrderApp {
    public static void main(String[] args) {
        // TODO: Refactor the PaymentService using the Strategy pattern
        // 1. Create a PaymentStrategy interface with a pay(double amount) method
        // 2. Implement concrete strategies (CreditCardStrategy, PayPalStrategy, CryptoStrategy)
        // 3. Update PaymentService to accept a PaymentStrategy instead of a string
        // 4. Test the refactored code here by passing different strategies to the PaymentService
    }
}
