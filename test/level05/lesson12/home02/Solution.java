package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man manSerega = new Man("Serega", 40, "Wasingtonova");
        Man manPetr = new Man("Petr", 41, "Parizska");
        Woman womanDaska = new Woman("Daska", 39, "Bratislavska");
        Woman womanTerezka = new Woman("Terezka", 38, "Moskevska");



        // Создай по два объекта каждого класса тут

        System.out.println(manSerega);
        System.out.println(manPetr);
        System.out.println(womanDaska);
        System.out.println(womanTerezka);
// Выведи их на экран тут
    }

    public static class Man
    {


        String name;
        int age;
        String address;

        public Man(String name, int age, String address)
        {


            this.name = name;
            this.age = age;
            this.address = address;

        }

        @Override
        public String toString()
        {
            return this.name+" "+this.age+" "+this.address;
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {


            this.name = name;
            this.age = age;
            this.address = address;

        }
        @Override
        public String toString()
        {
            return this.name+" "+this.age+" "+this.address;
        }
    }// Напиши тут свои классы
}
