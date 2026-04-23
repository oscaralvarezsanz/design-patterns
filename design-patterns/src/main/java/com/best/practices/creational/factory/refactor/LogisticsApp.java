package com.best.practices.creational.factory.refactor;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class LogisticsApp {
    private final Map<TransportType, TransportFactory> factories;

    public LogisticsApp(List<TransportFactory> factories) {
        this.factories = factories.stream()
                .collect(Collectors.toMap(TransportFactory::getType, Function.identity()));
    }

    public void planDelivery(TransportType type) {
        TransportFactory transportFactory = factories.get(type);

        if (transportFactory == null) {
            throw new IllegalArgumentException("Unknown transport type: " + type);
        }

        Transport transport = transportFactory.createTransport();
        transport.deliver();
    }
}
