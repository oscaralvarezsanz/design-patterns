package com.best.practices.structural.bridge.refactor;

public abstract class Device {
    protected int volume = 30;
    protected boolean on = false;

    public abstract void power();
    public abstract int getVolume();
    public abstract void setVolume(int volume);
    public abstract void volumeDown();
    public abstract void volumeUp();
}
