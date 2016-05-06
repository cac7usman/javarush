package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Alex on 19.10.2015.
 */
public class Hippodrome {
    public static Hippodrome game;
    ArrayList<Horse> horses = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {

        game = new Hippodrome();
        Horse horse1 = new Horse ("Trezor", 3, 0);
        Horse horse2 = new Horse ("Klikar", 3, 0);
        Horse horse3 = new Horse ("Favorit", 3, 0);


        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
       game.run();
        game.printWinner();








    }
    public ArrayList<Horse> getHorses() {


        return horses;
    }

    public void run() throws InterruptedException {
        for (int index = 0; index<100; index++)
        {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move()
    {
            for (Horse horse : horses)
            {
                horse.move();
            }
    }
    public void print()
    {
            for (Horse horse : horses)
            {
                horse.print();
            }
        System.out.println();
        System.out.println();
    }

    public Horse getWinner()
    {
        Horse winner = horses.get(0);
        for (Horse horse : horses)
        {
            if (horse.getDistance() > winner.getDistance())
                winner = horse;
        }

        return winner;
    }

    public void printWinner()
    {
        System.out.println("Winner is "+getWinner().getName()+"!");
    }





}
