package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, включая символы новой строки. Результат вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String sourceName = r.readLine();
        String writerName = r.readLine();

        r.close();

        BufferedReader reader = new BufferedReader(new FileReader(sourceName));
        PrintWriter writer = new PrintWriter(new FileWriter(writerName));


        ArrayList<String> rawList = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();

        String stringLine;
        while ((stringLine = reader.readLine()) != null)
        {
            rawList.add(stringLine);
        }
        reader.close();

        String newString = "";
        for (String string : rawList)
        {
            newString = string.replaceAll("\\p{P}",""); // regex which delete all punctuation
            newList.add(newString);
        }


        for (String finish : newList) {
            writer.println(finish);

        }
        writer.close();




    }
}
