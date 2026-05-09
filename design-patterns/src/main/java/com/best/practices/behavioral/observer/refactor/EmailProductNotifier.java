package com.best.practices.behavioral.observer.refactor;

public class EmailProductNotifier implements ProductNotifier{
    private static final EMAIL_MESSAGE_HEADING = "[EmailService] Sending email: "
    private static final NEW_PRODUCT_TEXT = "New product available: "

    public void notifyProduct(String name){
        System.out.println(EMAIL_MESSAGE_HEADING + NEW_PRODUCT_TEXT + name);
    }
}