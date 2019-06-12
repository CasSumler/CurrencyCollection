package com.company;

import java.math.BigDecimal;

public class Dime
{
    private int year;

    public Dime(int year)
    {
        this.year = year;
    }

    public Dime()
    {
        this.year = 2000;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal("0.10");
    }

    public BigDecimal getCollectibleValue()
    {
        return getFaceValue();
    }
}
