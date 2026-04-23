package com.best.practices.creational.factory.refactor;

public interface TransportFactory {
    Transport createTransport();
    TransportType getType();
}
