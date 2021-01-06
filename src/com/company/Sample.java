package com.company;

public class Sample
{
    static class Lamp
    {
        boolean isOn;

        void turnOn()
        {
            isOn = true;
            System.out.println("Light on? " + isOn);


        }

        void turnOff()
        {
            isOn = false;
            System.out.println("Light on? " + isOn);
        }
    }
}
