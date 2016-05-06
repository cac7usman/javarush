package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {


        int i = 0;
        while (i<10)
        {
        i++;
        System.out.print(i + " ");
        }
        System.out.println();
        int a = 0;
        while (a<10)
        {
            a++;
        System.out.print(a * 2 + " ");
        }
        System.out.println();
        int b = 0;
        while (b<10)
        {
            b++;
            System.out.print(b * 3 + " ");
        }
        System.out.println();
        int c = 0;
        while (c<10)
        {
            c++;
            System.out.print(c * 4 + " ");
        }
        System.out.println();
        int d = 0;
        while (d<10)
        {
            d++;
            System.out.print(d * 5 + " ");
        }
        System.out.println();
        int e = 0;
        while (e<10)
        {
            e++;
            System.out.print(e * 6 + " ");
        }
        System.out.println();
        int f = 0;
        while (f<10)
        {
            f++;
            System.out.print(f * 7 + " ");
        }
        System.out.println();
        int g = 0;
        while (g<10)
        {
            g++;
            System.out.print(g * 8 + " ");
        }
        System.out.println();
        int h = 0;
        while (h<10)
        {
            h++;
            System.out.print(h * 9 + " ");
        }
        System.out.println();
        int j = 0;
        while (j<10)
        {
            j++;
            System.out.print(j * 10 + " ");
        }
    }
}
