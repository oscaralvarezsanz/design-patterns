package com.best.practices.structural.bridge.problem;

public class SmartHomeApp {

    public void controlDevices() {
        // CODE SMELL: Combinatorial explosion of classes!
        // We have classes for every combination of Device (TV, Radio) and Remote (Basic, Advanced).
        // If we add a new Device (like DVD) or a new Remote (like SmartRemote), we need to create many more classes.
        
        RemoteControl tvRemote = new AdvancedTvRemote();
        tvRemote.power();
        if (tvRemote instanceof AdvancedTvRemote) {
            ((AdvancedTvRemote) tvRemote).mute();
        }

        RemoteControl radioRemote = new BasicRadioRemote();
        radioRemote.power();
        radioRemote.volumeUp();
    }
}
