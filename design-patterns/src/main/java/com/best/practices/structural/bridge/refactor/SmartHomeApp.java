package com.best.practices.structural.bridge.refactor;

public class SmartHomeApp {

    public void controlDevices() {
        // TODO: Refactor this code to use the Bridge pattern!
        // 1. Create a `Device` interface (enable, disable, isEnabled, getVolume, setVolume)
        // 2. Create concrete devices `Tv` and `Radio` implementing `Device`.
        // 3. Modify `RemoteControl` to hold a reference to a `Device`.
        // 4. Create `BasicRemote` and `AdvancedRemote` (extends `RemoteControl`).
        // 5. Use composition below instead of these highly coupled classes.
        
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
