package com.best.practices.structural.facade.problem;

public class NotificationSystem {
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}
