package com.company;

public class Color
{
    private String lampColor;
    private String kitchenLamp;

    public Color(String lampColor, String kitchenLamp)
    {
        this.lampColor = lampColor;
        this.kitchenLamp = kitchenLamp;
    }

    public String getLampColor()
    {
        return lampColor;
    }

    public void setLampColor(String lampColor)
    {
        this.lampColor = lampColor;
    }

    public String getKitchenLamp() {
        return kitchenLamp;
    }

    public void setKitchenLamp(String kitchenLamp) {
        this.kitchenLamp = kitchenLamp;
    }


}

