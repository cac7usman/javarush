package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String fileN = r.readLine();

        FileInputStream inputStream = new FileInputStream(fileN);

        int count = 0;

        while (inputStream.available()>0)
        {
            int a = inputStream.read();
            if (a==44) count++;
        }

        System.out.println(count);
        r.close();
        inputStream.close();
    }
}
