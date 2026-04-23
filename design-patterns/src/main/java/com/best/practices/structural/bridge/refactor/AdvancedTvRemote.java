package com.best.practices.structural.bridge.refactor;

public class AdvancedTvRemote extends BasicTvRemote {
    public void mute() {
        System.out.println("TV: muted");
        volume = 0;
    }
}
