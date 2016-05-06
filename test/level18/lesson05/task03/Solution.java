package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();


        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream2 = new FileOutputStream(file2);
        FileOutputStream outputStream3 = new FileOutputStream(file3);

        byte[] buffer = new byte[inputStream.available()];


        while (inputStream.available() > 0)
        {
            if (inputStream.available() % 2== 0)
            {
                byte[] array1 = new byte[inputStream.available()/2];
                byte[] array2 = new byte[inputStream.available()/2];

                int count1 = inputStream.read(array1);
                int count2 = inputStream.read(array2);

                outputStream2.write(array1, 0, count1);
                outputStream3.write(array2, 0, count2);

            }

            else
            {
                byte[] array1 = new byte[inputStream.available()/2 + 1];
                byte[] array2 = new byte[inputStream.available()/2];

                int count1 = inputStream.read(array1);
                int count2 = inputStream.read(array2);

                outputStream2.write(array1, 0, count1);
                outputStream3.write(array2, 0, count2);
            }
        }





        reader.close();
        inputStream.close();
        outputStream2.close();
        outputStream3.close();






    }


}
