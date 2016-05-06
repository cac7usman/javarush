package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String jmeno;
    private int vyska;
    private String color;

    private Dog (String jmeno)
    {
        this.jmeno = jmeno;
    }

    private Dog (String jmeno, int vyska)
    {
        this.jmeno = jmeno;
        this.vyska = vyska;
    }

    private Dog (String jmeno, int vyska, String color)
    {
        this.jmeno = jmeno;
        this.vyska = vyska;
        this.color = color;


    }

}
