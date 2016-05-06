package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        FileWriter outputStream = new FileWriter(sourceFileName);

        ArrayList<String> array = new ArrayList<String>();

        while (true)
        {
            String s = reader.readLine();
            array.add(s);
            if (s.equals("exit")) {
                for (String str : array) {
                    outputStream.write(str);
                }
                break;
            }
            array.add("\n");
        }


        reader.close();
        outputStream.close();
    }
}
