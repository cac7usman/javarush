package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String jmeno;
    String vyska;
    String barva;

    public void initialize(String jmeno)
    {
        this.jmeno = jmeno;
    }//Напишите тут ваш код
    public void initialize(String jmeno, String vyska)
    {
        this.jmeno = jmeno;
        this.vyska = vyska;

    }
    public void initialize(String jmeno, String vyska, String barva)
    {
        this.jmeno = jmeno;
        this.vyska = vyska;
        this.barva = barva;

    }

}
