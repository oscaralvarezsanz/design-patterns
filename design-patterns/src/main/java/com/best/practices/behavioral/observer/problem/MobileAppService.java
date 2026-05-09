package com.best.practices.behavioral.observer.problem;

public class MobileAppService {
    public void sendPushNotification(String message) {
        System.out.println("[MobileAppService] Sending push notification: " + message);
    }
}
