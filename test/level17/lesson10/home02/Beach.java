package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;


public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {

      return name.compareTo(o.getName()) + (int)(distance*quality - o.getDistance()*o.getQuality());
    }

    public static void main(String[] args) {


        ArrayList<Beach> beaches = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            beaches.add(new Beach(Beach.toGenerate(), Beach.toGenerateFloat(), Beach.toGenerateInt()));
        }

        Collections.sort(beaches);
        for (int i = 0; i < beaches.size(); i++) {
            System.out.println(beaches.get(i).getName()+" "+beaches.get(i).getQuality());
        }




    }

    private static String toGenerate() {
        ArrayList<String> alphaNum = new ArrayList<String>();

        for (char c = 'A'; c <= 'z'; c++) {
            String s = new String();
            s += c;
            alphaNum.add(s);
            //Исключаем лишние символы ( ],[,...)
            if (c == 'Z') c = 'a' - 1;
        }

        for (int c = 0; c < 10; c++) {
            String s = new String();
            s += c;
            alphaNum.add(s);
        }

        String symbol = alphaNum.get((int) (Math.random() * alphaNum.size()));
        //Вывод случайного элемента из этого массива

        return symbol;
    }

    private static float toGenerateFloat() {
        Random rand = new Random();
        float finalX = rand.nextFloat();

        return finalX;
    }

    private static int toGenerateInt() {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 5) + 1) + 5;
        return randomNum;
    }


}


