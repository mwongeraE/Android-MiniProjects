package com.mwongera.temperatureconverter;

public class ConverterUtil {
    //converts to celsius
    public static float convertFahrenheitToCelcius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9 );
    }

    //converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5 ) + 32;
    }
}
