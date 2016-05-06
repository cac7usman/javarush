package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<int[]>();

        list.add (new int[5]);//напишите тут ваш код
        list.add (new int[2]);//напишите тут ваш код
        list.add (new int[4]);//напишите тут ваш код
        list.add (new int[7]);//напишите тут ваш код
        list.add (new int[0]);//напишите тут ваш код

        for (int j = 0; j<list.size(); j++)
        {
            for (int i = 0; i<list.get(j).length; i++)
            {
                list.get(j)[i] = (int)(1000.0*(Math.random()));
            }
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
