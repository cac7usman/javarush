package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getCountTheSameFirstName(createMap(), "Vlad"));
        System.out.println(getCountTheSameLastName(createMap(), "Cepes"));
    }
    public static HashMap<String, String> createMap()
    {

        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i<10; i++)
        {
            map.put("Vlad" + i, "Cepes" + i);
        }
        return map; //Напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> imja = iterator.next();
            String value = imja.getValue();
            if(value.equals(name))
            i++;
            }
        return i;

            //Напишите тут ваш код
        }



    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int i = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> familija = iterator.next();
            String value = familija.getKey();
            if(value.equals(familiya))
                i++;
        }
        return i;

    }
}
