package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float t = this.getValue();
        t = (float) ((t * (9.0 / 5)) + 32);
        Fahrenheit newTemp = new Fahrenheit(t);
        return newTemp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}