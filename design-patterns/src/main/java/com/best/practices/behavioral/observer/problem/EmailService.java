package com.best.practices.behavioral.observer.problem;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("[EmailService] Sending email: " + message);
    }
}
