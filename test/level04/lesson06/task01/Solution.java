package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cislo1 = reader.readLine();
        String cislo2 = reader.readLine();

        int a = Integer.parseInt(cislo1);
        int b = Integer.parseInt(cislo2);

        if (a<b)
        {System.out.println(a);}
        else//Напишите тут ваш код
        {System.out.print(b);}
        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
    }
}