package com.javarush.test.level14.lesson08.home09;

/**
 * Created by asus on 21.08.2015.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        String HRN = "HRN";
        return HRN;
    }
}
