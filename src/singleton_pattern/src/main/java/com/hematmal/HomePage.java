package com.hematmal;

public class HomePage {
    public Settings settings = Settings.CreateInstance();
    
    public String PrintThemeName()
    {
        return settings.GetTheme();
    }
}
