package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String sourceName = r.readLine();
        String destinationName = r.readLine();


        BufferedReader reader = new BufferedReader(new FileReader(sourceName));
        FileWriter writer = new FileWriter(destinationName);

        ArrayList<String> list = new ArrayList<>(); // raw data
        ArrayList<Integer> data = new ArrayList<>(); //

        String stringLine = "";

        while ((stringLine = reader.readLine()) !=null) {

            list.add(stringLine);

        }
        reader.close();
        r.close();


        String[] s;

        for (int i = 0; i<list.size(); i++)
        {
            s = list.get(i).split(" ");

            for (String word : s) {
                try {
                    data.add(Integer.parseInt(word));
                } catch (NumberFormatException e) {
                }
            }
        }







        for (Integer number : data)
        {
            writer.write(number+ " ");
        }

        writer.close();



    }









}
