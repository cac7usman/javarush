package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String file1 = r.readLine();
        String file2 = r.readLine();
        String file3 = r.readLine();

        BufferedReader reader1 = new BufferedReader(new FileReader(file2));
        BufferedReader reader2 = new BufferedReader(new FileReader(file3));
        FileWriter writer = new FileWriter(file1);

        r.close();

        String StringLine = "";

        while ((StringLine = reader1.readLine()) != null)
        {
            writer.write(StringLine);
        }

        reader1.close();

        while ((StringLine = reader2.readLine()) != null)
        {
            writer.write(StringLine);
        }

        reader2.close();
        writer.close();



    }
}
