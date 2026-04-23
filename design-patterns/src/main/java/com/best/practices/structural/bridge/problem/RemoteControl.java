package com.best.practices.structural.bridge.problem;

public abstract class RemoteControl {
    protected int volume = 30;
    protected boolean on = false;

    public abstract void power();
    public abstract void volumeDown();
    public abstract void volumeUp();
}
