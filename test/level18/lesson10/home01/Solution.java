package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/


import java.io.BufferedReader;

import java.io.FileReader;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        int counter = 0;
        int c;
        ArrayList<Character> chars = new ArrayList<>();

        while ((c = reader.read()) != -1)
        {
            chars.add((char) c);
        }
        reader.close();


        for (Character ch : chars)
        {
            String s = String.valueOf(ch);
            if (s.matches("[A-z]")) counter++;

        }


        System.out.println(counter);




    }
}
