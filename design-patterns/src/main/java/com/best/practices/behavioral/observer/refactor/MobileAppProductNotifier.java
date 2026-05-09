package com.best.practices.behavioral.observer.refactor;

public class MobileAppProductNotifier implements ProductNotifier{
    private static final MOBILE_MESSAGE_HEADING = "[MobileAppService] Sending push notification: "
    private static final NEW_PRODUCT_TEXT = "Check out our new "

    public void notifyProduct(String name){
        System.out.println(MOBILE_MESSAGE_HEADING + NEW_PRODUCT_TEXT + name);
    }
}