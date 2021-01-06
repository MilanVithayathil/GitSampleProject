package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println("Hello github!!!");

        Sample.Lamp led = new Sample.Lamp();
        Sample.Lamp halogen = new Sample.Lamp();

        led.turnOn();
        halogen.turnOn();
        led.turnOff();
        halogen.turnOff();
    }
}
