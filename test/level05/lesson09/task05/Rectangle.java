package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private String copy;
    private int top;
    private int left;
    private int width;
    private int height;

    private Rectangle(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    private Rectangle(int top, int left)
    {
        this.top = top;
        this.left = left;
        this.height = 0;
        this.width = 0;
    }

    private Rectangle(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.height = width;
        this.width = width;
    }

    private Rectangle(String copy)
    {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;

    }
}
