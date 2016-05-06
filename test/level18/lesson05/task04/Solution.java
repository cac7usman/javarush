package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2);

        byte[] buffer = new byte[in.available()];
        int count = in.read(buffer);


       for (int i = 0; i<buffer.length/2; i++)
        {
            int tmp = buffer[i];
            buffer[i] = buffer[buffer.length-i-1];
            buffer[buffer.length-i-1]= (byte) tmp;

        }



            out.write(buffer, 0, count);


        reader.close();
        in.close();
        out.close();

        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i]+" ");
        }
        System.out.println();


    }

    /*public static void SwapArray (byte[] buffer)
    {



    }*/
}
