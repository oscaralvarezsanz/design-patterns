package com.best.practices.structural.decorator.refactor;

// I assume the idea is to always send an email the same way the example does,
// even though I dont agree with that design.
public class NotificationApp {
    public static void main(String[] args) {
        System.out.println("--- Standard Notification (email)--");
        Notifier standardNotifier = new Notifier();
        standardNotifier.send("Server is up.");

        System.out.println("\n--- SMS Notification ---");
        Notifier smsNotifier = new SMSNotifier(standardNotifier);
        smsNotifier.send("Server load is high.");

        System.out.println("\n--- SMS and Slack Notification ---");
        Notifier alertNotifier = new SlackNotifier(smsNotifier);
        alertNotifier.send("Server is DOWN!");
    }
}
