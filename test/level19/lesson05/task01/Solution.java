package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws  IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();



        FileReader in = new FileReader(file1);
        FileWriter out = new FileWriter(file2);




        while (in.ready()) {
            in.read();
            out.write(in.read());
        }





        reader.close();
        in.close();
        out.close();

    }
}
