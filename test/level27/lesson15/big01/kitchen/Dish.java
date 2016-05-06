package com.javarush.test.level27.lesson15.big01.kitchen;

import java.util.Arrays;

/**
 * Created by Alex on 07.04.2016.
 */
public enum Dish {
    Fish,
    Steak,
    Soup,
    Juice,
    Water;


    public static String allDishesToString()
    {

        String s = Arrays.toString(Dish.values());
        return s;
    }
}
