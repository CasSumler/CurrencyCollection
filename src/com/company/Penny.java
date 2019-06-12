package com.company;

import java.math.BigDecimal;

public class Penny
{
    private int year;

    public Penny(int year)
    {
        this.year = year;
    }

    public Penny()
    {
        this.year = 2000;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal("0.01");
    }

    public BigDecimal getCollectibleValue()
    {
        final int COLLECTIBLE_YEAR = 1945;

        BigDecimal collectibleValueMultiplier = new BigDecimal("0.03");

        BigDecimal collectibleYears = BigDecimal.ZERO;
        if(year < COLLECTIBLE_YEAR)
        {
            collectibleYears = new BigDecimal(COLLECTIBLE_YEAR - year);
        }

        BigDecimal collectibleValue = getFaceValue().add(collectibleValueMultiplier.multiply(collectibleYears));

        return collectibleValue;
    }
}
