package com.javarush.test.level22.lesson13.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {

    public static String [] getTokens(String query, String delimiter) {

        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);

        ArrayList<String> arrayList = new ArrayList<>();
        while (tokenizer.hasMoreTokens())

            arrayList.add(tokenizer.nextToken());
            String[] stringArray = new String[arrayList.size()];
        for (int i = 0; i<stringArray.length; i++)

            stringArray[i] = arrayList.get(i);

        return stringArray;






    }

    public static void main(String[] args) {


        getTokens("level22.lesson13.task01",".");


    }
}
