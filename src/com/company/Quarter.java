package com.company;

import java.math.BigDecimal;

public class Quarter
{
    private int year;

    public Quarter(int year)
    {
        this.year = year;
    }

    public Quarter()
    {
        this.year = 2000;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal("0.25");
    }

    public BigDecimal getCollectibleValue()
    {
        final int COLLECTIBLE_YEAR = 1923;

        BigDecimal collectibleValueMultiplier = new BigDecimal("0.22");

        BigDecimal collectibleYears = BigDecimal.ZERO;
        if(year < COLLECTIBLE_YEAR)
        {
            collectibleYears = new BigDecimal(COLLECTIBLE_YEAR - year);
        }

        BigDecimal collectibleValue = getFaceValue().add(collectibleValueMultiplier.multiply(collectibleYears));

        return collectibleValue;
    }
}
