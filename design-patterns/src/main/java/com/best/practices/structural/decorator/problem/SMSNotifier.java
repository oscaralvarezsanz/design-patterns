package com.best.practices.structural.decorator.problem;

public class SMSNotifier extends Notifier {
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}
