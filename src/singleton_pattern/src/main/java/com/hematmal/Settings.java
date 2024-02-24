package com.hematmal;

public class Settings {
    private String theme = "Dark";
    private String language = "English";

    public static Settings settings = null;

    private Settings()
    {

    }   

    public static Settings CreateInstance()
    {
        if(settings == null)
        {
            settings = new Settings();
        }
        return settings;
    }

    public void SetTheme(String theme) throws Exception {
        if (theme == "Dark") {
            this.theme = theme;
        } else if (theme == "Light") {
            this.theme = theme;
        } else {
            throw new Exception("Theme not supported");
        }
    }

    public String GetTheme() {
        return theme;
    }

    public void SetLanguage(String language) {
        this.language = language;
    }

    public String GetLanguage() {
        return language;
    }
}
