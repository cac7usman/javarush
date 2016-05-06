package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("мама");
        list1.add("мыла");
        list1.add("раму");
        String s = "именно";


        for (int i = list1.size(); i>0; i--)
        {
           list1.add(i, s);


        }


        for (int j = 0; j<list1.size(); j++)
        {
            System.out.println(list1.get(j));//Напишите тут ваш код
        }

    }
}
