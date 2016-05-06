package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();


        FileInputStream inputStream = new FileInputStream(fileName);
        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available() > 0)
        {
            inputStream.read(buffer);

        }
        inputStream.close();



        Arrays.sort(buffer);
        removeDuplicates(buffer);







    }

    public static void removeDuplicates(byte[] buffer)
    {
        boolean[] mask = new boolean[buffer.length];
        int removeCount = 0;

        for (int i = 0; i<buffer.length; i++)
        {
            if (!mask[i])
            {
                int tmp = buffer[i];

                for (int j = i + 1; j<buffer.length; j++)
                {
                    if (tmp == buffer[j])
                    {
                        mask[j] = true;
                        removeCount++;
                    }
                }
            }
        }

        byte[] result = new byte[buffer.length - removeCount];
        for (int i = 0, j = 0; i < buffer.length; i++)
        {
            if (!mask[i])
            {
                result[j++] = buffer[i];
            }
        }

        for (int i = 0; i<result.length;i++)
        {

            System.out.print(result[i]+" ");
        }



    }


}
