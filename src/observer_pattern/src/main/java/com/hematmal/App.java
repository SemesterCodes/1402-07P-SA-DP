package com.hematmal;

public class App 
{
    public static void main( String[] args )
    {
        WeatherData weather = new WeatherData();
        
        CurrentDisplay currentDisplay = new CurrentDisplay(weather);
        iPadDisplay iPadDisplay = new iPadDisplay(weather);

        weather.SetTemperature(12);
        weather.SetTemperature(14);

        weather.SetTemperature(13);
    }
}
