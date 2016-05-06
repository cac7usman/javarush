package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String file1 = r.readLine();
        String file2 = r.readLine();

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        FileWriter fileWriter = new FileWriter(file2);

        r.close();
        ArrayList<String> rawdata = new ArrayList<>();
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();

        String line = "";

        while ((line = reader.readLine()) !=null)
        {
            rawdata.add(line);
        }

        reader.close();


        String[] doubles;

        for (int i = 0; i < rawdata.size(); i++) {
            doubles = rawdata.get(i).split(" ");

            for (String d : doubles)
            {
             try
             {
                 numbers.add((Double.parseDouble(d)));
             }
             catch (NumberFormatException e)
             {

             }
            }
        }

        for (Double d : numbers)
        {
            int cislo = (int) Math.round(d);
            n.add(cislo);
        }



        for (Integer number : n)
        {
            fileWriter.write(number+ " ");
        }

        fileWriter.close();

    }
}
