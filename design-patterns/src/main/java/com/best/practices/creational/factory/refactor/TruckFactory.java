package com.best.practices.creational.factory.refactor;

import org.springframework.stereotype.Component;

@Component
public class TruckFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }

    @Override
    public TransportType getType() {
        return TransportType.TRUCK;
    }
}