package com.best.practices.structural.bridge.refactor;

public class Radio extends Device{
    private static final int VOLUME_STEP = 2;

    @Override
    public void power() {
        System.out.println("Radio: power toggled");
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
