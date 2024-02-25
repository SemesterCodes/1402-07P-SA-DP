package com.hematmal.RemoteControl;

import com.hematmal.Contracts.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(Command slot) {
        this.slot = slot;
    }

    public void onButtonWasPressed() {
        slot.execute();
    }
}
