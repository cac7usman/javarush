package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String sourceName = r.readLine();
        FileReader reader = new FileReader(sourceName);
        String text ="";
        char current = ' ';
        while (reader.ready())
        {
            current = (char)reader.read();
            text = text+current;
        }
        String replacedS = text.replaceAll("\\p{P}"," ").toLowerCase();
        replacedS = replacedS.replaceAll("\\s", " ");

        String words[] = replacedS.split(" ");
        int count = 0;
        for (String w : words) {

            if (w.equals("world")) {count++;}

        }
        System.out.println(count);
        r.close();
        reader.close();
    }


}
