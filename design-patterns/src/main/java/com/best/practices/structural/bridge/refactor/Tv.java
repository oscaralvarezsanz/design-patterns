package com.best.practices.structural.bridge.refactor;

public class Tv extends Device {
    private static final int VOLUME_STEP = 5;

    @Override
    public void power() {
        System.out.println("TV: power toggled");
        on = !on;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void volumeDown() {
        int newVolume = getVolume() - VOLUME_STEP;
        setVolume(newVolume < 0 ? 0 : newVolume);
    }

    @Override
    public void volumeUp() {
        int newVolume = getVolume() + VOLUME_STEP;
        setVolume(newVolume > 100 ? 100 : newVolume);
    }
}
