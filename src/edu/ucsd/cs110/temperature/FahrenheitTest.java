package edu.ucsd.cs110.temperature;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yuhan on 4/24/16.
 */
public class FahrenheitTest {
    private float delta = 0.001f;

    @Test
    public void testFahrenheit() {
        float value = 12.34f;
        Fahrenheit temp = new Fahrenheit(value);
        assertEquals(value, temp.getValue(), delta);
    }

    @Test
    public void testFahrenheitToString() {
        float value = 12.34f;
        Fahrenheit temp = new Fahrenheit(value);
        String string = temp.toString();
        String beginning = "" + value;
        String ending = " F";
        // Verify the suffix of the formatted string
        assertTrue(string.startsWith(beginning));
        // Verify the prefix of the formatted string
        assertTrue(string.endsWith(ending));
        // Verify the middle of the formatted string
        int endIndex = string.indexOf(ending);
        // (Hint: what is the length of the middle of the string?)
        assertTrue(string.substring(0, endIndex).equals(beginning));

    }

    @Test
    public void testFahrenheitToFahrenheit() {
        Fahrenheit temp = new Fahrenheit(32);
        Temperature convert = temp.toFahrenheit();
        assertEquals(32, convert.getValue(), delta);
    }

    @Test
    public void testFahrenheitToCelsius(){
        Fahrenheit temp = new Fahrenheit(32);
        Temperature convert = temp.toCelsius(); assertEquals(0, convert.getValue(), delta);
        temp = new Fahrenheit(212); convert = temp.toCelsius();
        assertEquals(100, convert.getValue(), delta);
    }
}