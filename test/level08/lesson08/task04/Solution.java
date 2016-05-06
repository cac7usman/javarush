package com.javarush.test.level08.lesson08.task04;


import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            System.out.println(pair.getValue());
        }
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Сталлоне1", new Date("JULY 1 1980"));
        map.put("Сталлоне2", new Date("AUGUST 1 1980"));
        map.put("Сталлоне3", new Date("NOVEMBER 1 1980"));
        map.put("Сталлоне4", new Date("DECEMBER 1 1980"));
        map.put("Сталлоне5", new Date("OCTOBER 1 1980"));
        map.put("Сталлоне6", new Date("JUNE 1 1981"));
        map.put("Сталлоне7", new Date("JULY 1 1982"));
        map.put("Сталлоне8", new Date("AUGUST 2 1980"));
        map.put("Сталлоне9", new Date("MARCH 1 1980"));




        return map;//Напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8)
                iterator.remove();
        }


        //Напишите тут ваш код

    }
}
