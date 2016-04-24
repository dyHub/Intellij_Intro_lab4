package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {

    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float v = (getValue()-32)*5/9;
        return new Celsius(v);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(getValue());
    }


    public String toString()
    {
        // TODO: Complete this method
        return "" + this.getValue();
    }
}

