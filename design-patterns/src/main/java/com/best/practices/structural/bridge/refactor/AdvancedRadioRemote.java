package com.best.practices.structural.bridge.refactor;

public class AdvancedRadioRemote extends BasicRadioRemote {
    public void mute() {
        System.out.println("Radio: muted");
        volume = 0;
    }
}
