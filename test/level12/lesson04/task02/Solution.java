package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int m = 5;
        Integer n = 2;
        print(m);
        print(n);
    }



   public static void print(int m)
    {
        System.out.println(m);
    }
   public static void print(Integer n)
    {
        System.out.println(n);
    }
    //Напишите тут ваши методы
}
