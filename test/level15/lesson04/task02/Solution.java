package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix((byte) 2, (byte) 3, "8");
        printMatrix((short) 2, (byte) 3, "8");
        printMatrix( 2, (double) 3, "8");
        printMatrix((byte) 2, (short) 3, "8");
        printMatrix((short) 2, (short) 3, "8");
        printMatrix((double) 2, (double) 3, "8");
        printMatrix((float) 2, (float) 3, "8");
        printMatrix((double) 2, (float) 3, "8");

    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix (byte m, byte n, String value)
    {
        System.out.println(value+m+n);
    }
    public static void printMatrix (short m, byte n, String value)
    {
        System.out.println(value+m+n);
    }

    public static void printMatrix (int m, double n, String value)
    {
        System.out.println(value+m+n);
    }

    public static void printMatrix(byte m, short n, String value)
    {
        System.out.println(value+m+n);
    }
    public static void printMatrix(short m, short n, String value)
    {
        System.out.println(value+m+n);
    }
    public static void printMatrix(double m, double n, String value)
    {
        System.out.println(value+m+n);
    }
    public static void printMatrix(float m, float n, String value)
    {
        System.out.println(value+m+n);
    }
    public static void printMatrix(double m, float n, String value)
    {
        System.out.println(value+m+n);
    }

}
