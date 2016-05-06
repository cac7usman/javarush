package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {


        TestThread TestThread = new TestThread();
        TestThread.start();
        Thread.sleep(10000);
        TestThread.interrupt();
        //Add your code here - добавь код тут
    }

    //Add your code below - добавь код ниже
    public static class TestThread {
        public void run()
        {
            Thread current = Thread.currentThread();

            while(!current.isInterrupted())
            {
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("TIK");
            }

        }

        public void start()
        {
        }

        public void interrupt()
        {
        }
    }
}
