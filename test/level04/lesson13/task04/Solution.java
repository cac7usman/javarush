package com.javarush.test.level04.lesson13.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s = "8";
        for (int i = 1; i < 10; i++)
        {
            System.out.print(s);//Напишите тут ваш код
        }
        for (int j = 1; j <= 11; j++)
        {
            System.out.println(s);
        }

    }
}
