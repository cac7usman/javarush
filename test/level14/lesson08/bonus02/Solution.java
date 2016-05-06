package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        reader.close();


        System.out.println(getNOD(m, n));
    }


    public static int getNOD(int m, int n)
    {
        while (n !=0)
        {
            int tmp = m%n;
            m = n;
            n = tmp;
        }
        return m;
    }
}
