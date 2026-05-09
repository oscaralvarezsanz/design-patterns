package com.best.practices.behavioral.observer.refactor;

import java.util.ArrayList;
import java.util.List;

public class ProductNotificationManager{
    private List<ProductNotifier> productNotifiers;

    public ProductNotificationManager(){
        this.productNotifiers = new ArrayList<>();
    }

    public void subscribe(ProductNotifier notifier) {
        productNotifiers.add(notifier);
    }

    public void unsubscribe(ProductNotifier notifier) {
        productNotifiers.remove(notifier);
    }

    public void notifySubscribers(String productName){
        productNotifiers.stream().forEach(notifier -> notifier.notifyProduct(productName));
    }
}