package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("Barsik", new Cat("Barsik"));//Напишите тут ваш код
        map.put("Barsik1", new Cat("Barsik1"));//Напишите тут ваш код
        map.put("Barsik2", new Cat("Barsik2"));//Напишите тут ваш код
        map.put("Barsik3", new Cat("Barsik3"));//Напишите тут ваш код
        map.put("Barsik4", new Cat("Barsik4"));//Напишите тут ваш код
        map.put("Barsik5", new Cat("Barsik5"));//Напишите тут ваш код
        map.put("Barsik6", new Cat("Barsik6"));//Напишите тут ваш код
        map.put("Barsik7", new Cat("Barsik7"));//Напишите тут ваш код
        map.put("Barsik8", new Cat("Barsik8"));//Напишите тут ваш код
        map.put("Barsik9", new Cat("Barsik9"));

        return map;//Напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> newVariable = new HashSet<Cat>();
        for (Cat value : map.values())
        {
            newVariable.add(value);
        }
        return newVariable;
        //Напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }



        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
