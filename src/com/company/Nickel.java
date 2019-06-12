package com.company;

import java.math.BigDecimal;

public class Nickel
{
    private int year;

    public Nickel(int year)
    {
        this.year = year;
    }

    public Nickel()
    {
        this.year = 2000;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal("0.05");
    }

    public BigDecimal getCollectibleValue()
    {
        final int COLLECTIBLE_YEAR = 1935;

        BigDecimal collectibleValueMultiplier = new BigDecimal("0.10");

        BigDecimal collectibleYears = BigDecimal.ZERO;
        if(year < COLLECTIBLE_YEAR)
        {
            collectibleYears = new BigDecimal(COLLECTIBLE_YEAR - year);
        }

        BigDecimal collectibleValue = getFaceValue().add(collectibleValueMultiplier.multiply(collectibleYears));

        return collectibleValue;
    }


}
