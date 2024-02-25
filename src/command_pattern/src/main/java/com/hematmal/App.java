package com.hematmal;

import com.hematmal.Commands.LightOnCommand;
import com.hematmal.Iots.Light;
import com.hematmal.RemoteControl.SimpleRemoteControl;

public class App 
{
    public static void main( String[] args )
    {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl(lightOnCommand);

        simpleRemoteControl.onButtonWasPressed();
    }
}
