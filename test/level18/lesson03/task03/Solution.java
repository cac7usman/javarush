package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Byte, Integer> map = new HashMap<Byte, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();


        FileInputStream inputStream = new FileInputStream(fileName);
        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available() > 0)
        {
            inputStream.read(buffer);

        }
        inputStream.close();

        for (byte c : buffer)
        {
            int count = 0;
            for (byte c1 : buffer)
            {
                if (c == c1)
                    count++;
            }
            map.put(c, count);

        }

        int MaxByte = 0;

        for (Map.Entry<Byte, Integer> pair : map.entrySet())
        {
            if (pair.getValue() > MaxByte)
                MaxByte = pair.getValue();
        }

        for (Map.Entry<Byte, Integer> pair : map.entrySet())
        {
            if (pair.getValue().equals(MaxByte))
            {
                System.out.println(pair.getKey()+ " ");
            }
        }


    }
}
