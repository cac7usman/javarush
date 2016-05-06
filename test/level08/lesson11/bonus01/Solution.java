package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<String>();
        array.add("January");
        array.add("February");
        array.add("March");
        array.add("April");
        array.add("May");
        array.add("June");
        array.add("Jule");
        array.add("August");
        array.add("September");
        array.add("October");
        array.add("November");
        array.add("December");


        String s = reader.readLine();




            if (s.equals(array.get(0)))
            {
                System.out.println(array.get(0) + " is 1 month");
            }


            else if (s.equals(array.get(1)))
        {
            System.out.println(array.get(1) + " is 2 month");
        }


        else if (s.equals(array.get(2)))
        {
            System.out.println(array.get(2) + " is 3 month");
        }
        else if (s.equals(array.get(3)))
        {
            System.out.println(array.get(3) + " is 4 month");
        }
        else if(s.equals(array.get(4)))
        {
            System.out.println(array.get(4) + " is 5 month");
        }
        else if(s.equals(array.get(5)))
        {
            System.out.println(array.get(5) + " is 6 month");
        }
        else if(s.equals(array.get(6)))
        {
            System.out.println(array.get(6) + " is 7 month");
        }
        else if(s.equals(array.get(7)))
        {
            System.out.println(array.get(7) + " is 8 month");
        }
        else if(s.equals(array.get(8)))
        {
            System.out.println(array.get(8) + " is 9 month");
        }
        else if(s.equals(array.get(9)))
        {
            System.out.println(array.get(9) + " is 10 month");
        }
        else if(s.equals(array.get(10)))
        {
            System.out.println(array.get(10) + " is 11 month");
        }
        else if (s.equals(array.get(11)))
        {
            System.out.println(array.get(11) + " is 12 month");
        }




                //add your code here - напиши код тут
    }

}
