package com.javarush.test.level14.lesson06.home01;

/**
 * Created by asus on 08.08.2015.
 */
public class UkrainianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 500;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+ Country.UKRAINE+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";




    }
}
