package com.company;

public class Main
{
    public static void main(String[] args)
    {
        try {
            System.out.println("Hello World");

            Sample.Lamp led = new Sample.Lamp();
            Sample.Lamp halogen = new Sample.Lamp();

            led.turnOn();
            halogen.turnOn();
        }
        catch (ArithmeticException e){
            System.out.println("error");
        }
    }
}
