package com.hematmal.Commands;

import com.hematmal.Contracts.Command;
import com.hematmal.Iots.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
    
}
