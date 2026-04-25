package com.best.practices.structural.bridge.refactor;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void power();
    public abstract void volumeDown();
    public abstract void volumeUp();
}
