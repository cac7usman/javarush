package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int aDvacet[] = new int[20];
        int bDeset[] = new int[10];
        int cDeset[] = new int[10];

        for (int i = 0; i<aDvacet.length; i++)
        {
            String s = reader.readLine();
            aDvacet[i] = Integer.parseInt(s);
        }
            for (int k = 0; k < 10; k++)
            {
                bDeset[k] = aDvacet[k];
                cDeset[k] = aDvacet[10+k];
                System.out.println(cDeset[k]);
            }

        //Напишите тут ваш код

    }
}
