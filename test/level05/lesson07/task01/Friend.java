package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name;
    private String age;
    private String sex;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, String age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, String age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    //Напишите тут ваш код

}
