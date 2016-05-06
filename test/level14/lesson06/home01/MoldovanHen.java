package com.javarush.test.level14.lesson06.home01;

/**
 * Created by asus on 08.08.2015.
 */
public class MoldovanHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 1000;
    }
    @Override
    public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+ Country.MOLDOVA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";




    }
}
