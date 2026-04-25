package com.best.practices.structural.bridge.refactor;

public class SmartHomeApp {

    public void controlDevices() {
        Device tv = new Tv();
        RemoteControl tvRemote = new AdvancedRemote(tv);
        tvRemote.power();
        
        if(tvRemote instanceof AdvancedRemote advancedRemote)
            advancedRemote.mute();

        Device radio = new Radio();
        RemoteControl radioRemote = new BasicRemote(radio);
        radioRemote.power();
        radioRemote.volumeUp();
    }
}
