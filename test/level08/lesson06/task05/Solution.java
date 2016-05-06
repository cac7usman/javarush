package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        ArrayList list = new ArrayList();
        for (int i = 0; i<list.size(); i++)
        {
        list.get(i);//Напишите тут ваш код
        }
        return list;

    }

    public static List  getListForSet()
    {
        ArrayList list = new ArrayList();
        for (int i = 0; i<list.size(); i++)
        {
        list.set(i, "");//Напишите тут ваш код
        }
        return list;

    }

    public static List  getListForAddOrInsert()
    {
        LinkedList list = new LinkedList();
        for (int i = 0; i<list.size(); i++)
        {
        list.add("");//Напишите тут ваш код
        }
        return list;

    }

    public static List  getListForRemove()
    {
        LinkedList list = new LinkedList();
        for (int i = 0; i<list.size(); i++)
        {
        list.remove(i);//Напишите тут ваш код
        }
        return list;

    }
}
