package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(sourceFileName);


        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            System.out.print((char)data);
        }

        reader.close();
        fileInputStream.close();
        //add your code here
    }
}
