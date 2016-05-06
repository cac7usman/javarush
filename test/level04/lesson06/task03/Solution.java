package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());//Напишите тут ваш код
        int y = Integer.parseInt(reader.readLine());//Напишите тут ваш код
        int z = Integer.parseInt(reader.readLine());//Напишите тут ваш код

        if (x>y && x>z && y>z)
        {
            System.out.println(x+" "+y+" "+z);
        }
        if (x>z && x>y && z>y)
                    {
                        System.out.println(x+" "+z+" "+y);
        }
        if (y>x && y>z && x>z)
        {
            System.out.println(y+" "+x+" "+z);
        }
        if (y>z && y>x && z>x)
        {
            System.out.println(y+" "+z+" "+x);
        }
        if (z>x && z>y && x>y)
        {
            System.out.println(z+" "+x+" "+y);
        }
        if (z>y && z>x && y>x)
        {
            System.out.println(z+" "+y+" "+x);
        }
    }
}
