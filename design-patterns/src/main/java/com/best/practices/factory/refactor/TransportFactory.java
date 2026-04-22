package com.best.practices.factory.refactor;

public interface TransportFactory {
    Transport createTransport();
    TransportType getType();
}
