package com.javarush.test.level15.lesson12.home04;

/**
 * Created by asus on 28.08.2015.
 */
public class Earth implements Planet
{
    private static Earth instance;
    private Earth(){}
    public static Earth getInstance(){
        if (instance == null)
        {
            instance = new Earth();
        }
        return instance;
    }
}
