package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[10];

        for (int i = 0; i<list.length; i++)
        {
            list [i] = Integer.parseInt(reader.readLine());//Напишите тут ваш код
        }

        for (int i = 0; i<list.length; i++)
        {
            int j = list.length - 1 - i;
            System.out.println(list[j]);
        }//Напишите тут ваш код
    }
}
