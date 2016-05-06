package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String file1 = r.readLine();
        String file2 = r.readLine();
        r.close();

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);



        byte[] buf = new byte[fileInputStream1.available()];
        fileInputStream1.read(buf);
        fileInputStream1.close();


        byte[] buf1 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buf1);
        fileInputStream2.close();

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(buf1);


        FileOutputStream fileOutputStream1 = new FileOutputStream(file1, true);
        fileOutputStream1.write(buf);




        fileOutputStream.close();
        fileOutputStream1.close();



    }
}
