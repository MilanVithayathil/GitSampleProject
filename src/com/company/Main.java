package com.company;

public class Main
{
    public static void main(String[] args)
    {

            Sample.Lamp led = new Sample.Lamp();
            Sample.Lamp halogen = new Sample.Lamp();

            led.turnOn();
            halogen.turnOn();
    }
}
