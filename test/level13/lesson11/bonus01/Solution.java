package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;


import java.util.ArrayList;

import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();

        BufferedReader reader1 = new BufferedReader(new FileReader(sourceFileName));



        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

       while (true)
        {
            try {
                String s = reader1.readLine();
                if (s.isEmpty()) break;
                else if (Integer.parseInt(s)%2==0) even.add(Integer.parseInt(s));
                else if (!(Integer.parseInt(s)%2==0)) odd.add(Integer.parseInt(s));
            }
            catch (NullPointerException e)
            {
                break;
            }





        }

        reader.close();





        sortArray(even);

        for (Integer sort : even)
        {
            System.out.println(sort);
        }



        // напишите тут ваш код
    }

    private static void sortArray(ArrayList<Integer> even)
    {
        Collections.sort(even);
    }
}
