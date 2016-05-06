package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human son1 = new Human("Вася", true, 15, new ArrayList<Human>());
        Human son2 = new Human("Петя", true, 10, new ArrayList<Human>());
        Human daughter = new Human("Анжела", false, 5, new ArrayList<Human>());

        ArrayList<Human> ch = new ArrayList<Human>();
        ch.add(son1);
        ch.add(son2);
        ch.add(daughter);

        Human father = new Human ("Георгий", true, 30, ch);
        Human mother = new Human ("Люда", false, 32, ch);
        ArrayList<Human> p1 = new ArrayList<Human>();
        ArrayList<Human> p2 = new ArrayList<Human>();
        p2.add(father);
        p1.add(mother);


        Human ded1 = new Human("Макар", true, 75, p1);
        Human baba1 = new Human("Света", false, 55, p1);
        Human ded2 = new Human("Егор", true, 65, p2);
        Human baba2 = new Human("Егор", false, 56, p2);


        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());


    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }
//Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
