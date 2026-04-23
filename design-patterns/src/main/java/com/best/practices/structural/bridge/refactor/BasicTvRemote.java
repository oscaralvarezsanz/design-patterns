package com.best.practices.structural.bridge.refactor;

public class BasicTvRemote extends RemoteControl {
    @Override
    public void power() {
        System.out.println("TV: power toggled");
        on = !on;
    }

    @Override
    public void volumeDown() {
        System.out.println("TV: volume down");
        volume -= 10;
    }

    @Override
    public void volumeUp() {
        System.out.println("TV: volume up");
        volume += 10;
    }
}
