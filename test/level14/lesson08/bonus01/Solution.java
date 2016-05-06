package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
        int[] array = new int[10];

        array[10] = 10;//Add your code here
        }

        catch (Exception e1)
        {
            exceptions.add(e1);
        }

        try
        {
            String s = "zopa";

            int n = Integer.parseInt(s);
        }

        catch (Exception e2)
        {
            exceptions.add(e2);
        }

        try
        {
            String id = null;

            if (id == null) throw new NullPointerException();
        }

        catch (Exception e3)
        {
            exceptions.add(e3);
        }

        try
        {
            FileInputStream fis = new FileInputStream("C2:\\badFileName.txt");
        }

        catch (Exception e4)
        {
            exceptions.add(e4);
        }

        try
        {
            ArrayList<String> list = new ArrayList<String>(2);

            list.add("zopa");
            list.add("zopa");

            System.out.println(list.get(3));
        }
        catch(Exception e5)
        {
            exceptions.add(e5);
        }

        try
        {
            String id = null;

            if (id == null) throw new IllegalArgumentException();
        }
        catch(Exception e6)
        {
            exceptions.add(e6);
        }

        try
        {
            String id = null;

            if (id == null) throw new RuntimeException();
        }
        catch(Exception e7)
        {
            exceptions.add(e7);
        }

        try
        {
            String id = null;

            if (id == null) throw new IOException();
        }
        catch(Exception e8)
        {
            exceptions.add(e8);
        }

        try
        {
            String id = null;

            if (id == null) throw new Exception();
        }
        catch(Exception e9)
        {
            exceptions.add(e9);
        }

    }
}
