package com.best.practices.structural.facade.refactor;

public class NotificationService {
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}
