package com.javarush.test.level14.lesson06.home01;

import com.javarush.test.level14.lesson06.home01.Country;
import com.javarush.test.level14.lesson06.home01.Hen;

/**
 * Created by asus on 08.08.2015.
 */
public class BelarusianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 1500;
    }
    @Override
    public String getDescription()
    {
      return super.getDescription()+" Моя страна - "+ Country.BELARUS+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";




    }
}
