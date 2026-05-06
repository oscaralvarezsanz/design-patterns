package com.best.practices.behavioral.strategy.problem;

public class OrderApp {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        System.out.println("--- Order 1 ---");
        paymentService.processPayment("CREDIT_CARD", 150.00);

        System.out.println("\n--- Order 2 ---");
        paymentService.processPayment("PAYPAL", 45.50);

        System.out.println("\n--- Order 3 ---");
        paymentService.processPayment("CRYPTO", 900.00);
    }
}
