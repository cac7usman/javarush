package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String sourceName = r.readLine();
        String writerName = r.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(sourceName));
        FileWriter writer = new FileWriter(writerName);

        r.close();

        ArrayList<String> rawList = new ArrayList<>();
        ArrayList<String> newData = new ArrayList<>();

        String stringLine = "";

        while ((stringLine = reader.readLine()) != null)
        {
            rawList.add(stringLine);
        }

        reader.close();

        String newString = "";
        for (String rawString : rawList)
        {
            newString = rawString.replace(".", "!");

            newData.add(newString);
        }



        //arraylist to new file with line separator
        for (String finish : newData) {
            writer.write(finish);
            writer.write(System.getProperty("line.separator"));
        }
        writer.close();









    }
}
