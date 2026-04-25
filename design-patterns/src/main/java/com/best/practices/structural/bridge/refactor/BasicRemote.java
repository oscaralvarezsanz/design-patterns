package com.best.practices.structural.bridge.refactor;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        device.power();
    }

    @Override
    public void volumeDown() {
        device.volumeDown();
    }

    @Override
    public void volumeUp() {
        device.volumeUp();
    }
}
