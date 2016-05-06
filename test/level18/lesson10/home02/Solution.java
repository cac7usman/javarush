package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader(args[0]));
        ArrayList<Character> chars = new ArrayList<>();
        int spaces = 0;
        int c;

        while ((c = r.read()) != -1)
        {
            chars.add((char) c);
        }
        r.close();


        for (Character ch : chars)
        {
            String s = String.valueOf(ch);
            if (s.matches(" ")) spaces++;

        }
        double d = (((double)spaces/chars.size())*100);
        System.out.printf("%.2f", d);


    }
}
