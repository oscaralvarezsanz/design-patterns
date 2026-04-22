package com.best.practices.factory.refactor;

import org.springframework.stereotype.Component;

@Component
public class ShipFactory implements TransportFactory{
    
    @Override
    public Transport createTransport() {
        return new Ship();
    }

    @Override
    public TransportType getType() {
        return TransportType.SHIP;
    }
}
