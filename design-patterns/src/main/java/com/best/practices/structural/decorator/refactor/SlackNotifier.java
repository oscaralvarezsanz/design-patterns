package com.best.practices.structural.decorator.refactor;

public class SlackNotifier extends Notifier {
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Slack message: " + message);
    }
}
