package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String>set = new HashSet<String>();
        set.add("арбуз");//Напишите тут ваш код
        set.add("банан");//Напишите тут ваш код
        set.add("вишня");//Напишите тут ваш код
        set.add("груша");//Напишите тут ваш код
        set.add("дыня");//Напишите тут ваш код
        set.add("ежевика");//Напишите тут ваш код
        set.add("жень-шень");//Напишите тут ваш код
        set.add("земляника");//Напишите тут ваш код
        set.add("ирис");//Напишите тут ваш код
        set.add("картофель");//Напишите тут ваш код

        for (String text : set)
        {
            System.out.println(text);
        }
    }
}
