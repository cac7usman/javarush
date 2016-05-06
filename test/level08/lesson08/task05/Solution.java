package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {

       for (Map.Entry<String, String> pair: createMap().entrySet())
       {
           String key = pair.getKey();
           String value = pair.getValue();
           System.out.println(key+" : "+value);
       }
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Novak", "Jan");
        map.put("Novak1", "Leo");
        map.put("Novak2", "Honza");
        map.put("Novak3", "Honza");
        map.put("Kaderabek", "Ivan");
        map.put("Kaderabek1", "Ivan");
        map.put("Bila", "Lucie");
        map.put("Bila1", "Lucie");
        map.put("Kraus", "Milan");
        map.put("Kraus1", "Milan");

        return map;
        //Напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            map3.remove(pair.getKey());

            if (map3.containsValue(pair.getValue()))
            {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
