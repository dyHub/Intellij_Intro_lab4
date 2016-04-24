package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public abstract class Temperature {

    private float value;

    public Temperature(float v)	{
        value = v;
    }

    public final float getValue()	{
        return value;
    }

    public abstract Temperature toCelsius();

    public abstract Temperature toFahrenheit();
}
