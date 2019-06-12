package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CurrencyCollection
{
    private ArrayList<Penny> pennies = new ArrayList<>();
    private ArrayList<Nickel> nickels = new ArrayList<>();
    private ArrayList<Dime> dimes = new ArrayList<>();
    private ArrayList<Quarter> quarters = new ArrayList<>();

    public CurrencyCollection(int quarterCount, int dimeCount, int nickelCount, int pennyCount)
    {
        for(int pennyNumber = 0; pennyNumber < pennyCount; pennyNumber++)
        {
            Penny penny = new Penny();
            pennies.add(penny);
        }

        for(int nickelNumber = 0; nickelNumber < nickelCount; nickelNumber++)
        {
            Nickel nickel = new Nickel();
            nickels.add(nickel);
        }

        for(int dimeNumber = 0; dimeNumber < dimeCount; dimeNumber++)
        {
            Dime dime = new Dime();
            dimes.add(dime);
        }

        for(int quarterNumber = 0; quarterNumber < quarterCount; quarterNumber++)
        {
            Quarter quarter = new Quarter();
            quarters.add(quarter);
        }
    }

    public void addPenny(int year)
    {
        Penny penny = new Penny(year);
        pennies.add(penny);
    }

    public void addNickel(int year)
    {
        Nickel nickel = new Nickel(year);
        nickels.add(nickel);
    }

    public void addDime(int year)
    {
        Dime dime = new Dime(year);
        dimes.add(dime);
    }

    public void addQuarter(int year)
    {
        Quarter quarter = new Quarter(year);
        quarters.add(quarter);
    }

    public BigDecimal getPenniesFaceValue()
    {
        BigDecimal pennyCount = new BigDecimal(pennies.size());

        BigDecimal totalPenniesFaceValue = pennyCount.multiply(Penny.getFaceValue());
        return totalPenniesFaceValue;
    }

    public BigDecimal getNickelsFaceValue()
    {
        BigDecimal nickelCount = new BigDecimal(nickels.size());

        BigDecimal totalNickelsFaceValue = nickelCount.multiply(Nickel.getFaceValue());
        return totalNickelsFaceValue;
    }

    public BigDecimal getDimesFaceValue()
    {
        BigDecimal dimeCount = new BigDecimal(dimes.size());

        BigDecimal totalDimesFaceValue = dimeCount.multiply(Dime.getFaceValue());
        return totalDimesFaceValue;
    }

    public BigDecimal getQuartersFaceValue()
    {
        BigDecimal quarterCount = new BigDecimal(quarters.size());

        BigDecimal totalQuartersFaceValue = quarterCount.multiply(Quarter.getFaceValue());
        return totalQuartersFaceValue;
    }

    public BigDecimal getPenniesCollectibleValue()
    {
        BigDecimal total = new BigDecimal("0");

        for(Penny penny : pennies)
        {
            total = total.add(penny.getCollectibleValue());
        }

        return total;
    }

    public BigDecimal getNickelsCollectibleValue()
    {
        BigDecimal total = new BigDecimal("0");

        for(Nickel nickel : nickels)
        {
            total = total.add(nickel.getCollectibleValue());
        }

        return total;
    }

    public BigDecimal getDimesCollectibleValue()
    {
        BigDecimal total = new BigDecimal("0");

        for(Dime dime : dimes)
        {
            total = total.add(dime.getCollectibleValue());
        }

        return total;
    }

    public BigDecimal getQuartersCollectibleValue()
    {
        BigDecimal total = new BigDecimal("0");

        for(Quarter quarter : quarters)
        {
            total = total.add(quarter.getCollectibleValue());
        }

        return total;
    }

    public BigDecimal getFaceValue()
    {
        BigDecimal total = getPenniesFaceValue().add(getNickelsFaceValue().add(getDimesFaceValue().add(getQuartersFaceValue())));

        return total;
    }

    public BigDecimal getCollectibleValue()
    {
        BigDecimal total = getPenniesCollectibleValue().add(getNickelsCollectibleValue().add(getDimesCollectibleValue().add(getQuartersCollectibleValue())));

        return total;
    }
}
