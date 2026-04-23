package com.best.practices.structural.bridge.refactor;

public class BasicRadioRemote extends RemoteControl {
    @Override
    public void power() {
        System.out.println("Radio: power toggled");
        on = !on;
    }

    @Override
    public void volumeDown() {
        System.out.println("Radio: volume down");
        volume -= 5;
    }

    @Override
    public void volumeUp() {
        System.out.println("Radio: volume up");
        volume += 5;
    }
}
