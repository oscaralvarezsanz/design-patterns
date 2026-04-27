package com.best.practices.structural.decorator.refactor;

public class NotificationApp {
    public static void main(String[] args) {
        System.out.println("--- Standard Notification ---");
        Notifier standardNotifier = new Notifier();
        standardNotifier.send("Server is up.");

        System.out.println("\n--- SMS Notification ---");
        Notifier smsNotifier = new SMSNotifier();
        smsNotifier.send("Server load is high.");

        System.out.println("\n--- SMS and Slack Notification ---");
        // To send both SMS and Slack, we had to create a specific subclass!
        Notifier alertNotifier = new SMSAndSlackNotifier();
        alertNotifier.send("Server is DOWN!");
    }
}
