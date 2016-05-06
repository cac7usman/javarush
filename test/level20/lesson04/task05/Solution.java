package com.javarush.test.level20.lesson04.task05;

import java.io.*;

/* Как сериализовать что-то свое?
Сделайте так, чтобы сериализация класса Object была возможной
*/
public class Solution {
    public static class Object implements Serializable{
        public String string1;
        public String string2;
    }

    public static void main(String[] args) throws Exception{
        Object object = new Object();
        object.string1 = new String();
        object.string2= new String();

        FileOutputStream fileOutput = new FileOutputStream("file.tmp");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        outputStream.writeObject(object);
        fileOutput.close();
        outputStream.close();

        FileInputStream fiStream = new FileInputStream("file.tmp");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        Object object1 = (Object) objectStream.readObject();
        fiStream.close();
        objectStream.close();

        Object newObject = (Object)object1;

        object.string1.print();
        object.string2.print();
        object1.string1.print();
        object1.string1.print();

        System.out.println(object);
        System.out.println(object1);
    }

    public static int countStrings;

    public static class String implements Serializable{
        private final int number;

        public String() {
            number = ++countStrings;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }



}
