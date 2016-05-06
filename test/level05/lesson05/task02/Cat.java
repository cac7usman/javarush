package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public static void main(String[] args)
    {
        Cat Vasja = new Cat();
        Vasja.age = 10;
        Vasja.weight = 10;
        Vasja.strength = Vasja.age + Vasja.weight;

        Cat Micka = new Cat();
        Micka.age = 5;
        Micka.weight = 5;
        Micka.strength = Micka.age + Micka.weight;

        Vasja.fight(Micka);

    }


    public Cat()
    {

        this.name=name;
        this.age=age;
        this.weight=weight;
        this.strength=strength;

    }



    public boolean fight (Cat anotherCat)
    {
        if (this.strength > anotherCat.strength)
        {
        return true;//Напишите тут ваш код
        }
        else
        {
            return false;
        }

    }
}
