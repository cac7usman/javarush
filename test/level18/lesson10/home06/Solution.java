package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.*;


public class Solution {
    public static void main(String[] args) throws Exception{


        ArrayList<Character> C = new ArrayList<>();
        int c;
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while ((c = reader.read()) != -1)
        {
            C.add((char) c);
        }


        reader.close();

        TreeMap<Character, Integer> map = new TreeMap<>();

        Integer counter;

        for (Character i : C)
        {
            counter = map.get(i);
            map.put(i, counter == null ? 1 : counter + 1);//напишите тут ваш код
        }



        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }




}
