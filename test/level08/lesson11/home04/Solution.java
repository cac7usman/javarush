package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        int result = array.get(0);//find minimum here - найти минимум тут
        for (Integer i : array)
        {
            if (i < result) result = i;
        }
        return result;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minimum = Integer.parseInt(reader.readLine());



            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i = 0; i<minimum; i++)
            {
                int s = Integer.parseInt(reader.readLine());
                array.add(s);
            }

        return array;



    }
}
