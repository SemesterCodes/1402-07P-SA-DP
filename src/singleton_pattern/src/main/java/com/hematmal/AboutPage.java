package com.hematmal;

public class AboutPage {
    public Settings settings = Settings.CreateInstance();
    public String PrintThemeName() throws Exception
    {
        settings.SetTheme("Light");
        return settings.GetTheme();
    }
}
