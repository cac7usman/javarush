package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("Вася", true, 75, null, null);
        Human ded2 = new Human("Петя", true, 65, null, null);
        Human babka1 = new Human("Клара", false, 55, null, null);
        Human babka2 = new Human("Ксюша", false, 56, null, null);
        Human Father = new Human("Саша", true, 35, ded1.name, babka1.name);
        Human Mother = new Human("Маша", false, 27, ded2.name, babka2.name);
        Human reb1 = new Human("Марк", true, 11, Father.name, Mother.name);
        Human reb2 = new Human("Игорь", true, 10, Father.name, Mother.name);
        Human reb3 = new Human("София", false, 5, Father.name, Mother.name);

        System.out.println(ded1);//Написать тут ваш код
        System.out.println(ded2);//Написать тут ваш код
        System.out.println(babka1);//Написать тут ваш код
        System.out.println(babka2);//Написать тут ваш код
        System.out.println(Father);//Написать тут ваш код
        System.out.println(Mother);//Написать тут ваш код
        System.out.println(reb1);//Написать тут ваш код
        System.out.println(reb2);//Написать тут ваш код
        System.out.println(reb3);//Написать тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        String father;
        String mother;

        public Human(String name, boolean sex, int age, String father, String mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public  String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null)
                text += ", отец: " + this.father;

            if (this.mother != null)
                text += ", мать: " + this.mother;

            return text;
        }











        //Написать тут ваш код

       /* public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;*/
        }

    }


