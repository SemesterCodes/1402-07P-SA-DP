package com.hematmal;

public class ContactPage {
    public Settings settings = Settings.CreateInstance();
    public String PrintThemeName()
    {
        return settings.GetTheme();
    }
}
