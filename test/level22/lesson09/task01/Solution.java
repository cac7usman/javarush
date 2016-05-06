package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws Exception{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String fileName = r.readLine();

        r.close();

        BufferedReader filereader = new BufferedReader(new FileReader(fileName));

        ArrayList<String> rawData = new ArrayList<>();

        String string;

        while ((string = filereader.readLine()) != null)
        {
            rawData.addAll(Arrays.asList(string.split(" ")));
        }

        filereader.close();



        for (int i = 0; i<rawData.size(); i++)
        {
            for (int j = 0; j<rawData.size();) {

                StringBuilder stringBuilder = new StringBuilder(rawData.get(i));
                String s = stringBuilder.reverse().toString();

                if (rawData.get(j).equals(s) && j!=i)
                {
                    Pair pair = new Pair();

                    pair.first = rawData.get(j);
                    pair.second = rawData.get(i);

                    result.add(pair);
                    rawData.remove(j);
                    rawData.remove(i);
                    j = 0;
                }
                else
                    j++;
            }

        }

        for (Pair s : result)
        {
            System.out.println(s);
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }



}
