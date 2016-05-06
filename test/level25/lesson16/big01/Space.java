package com.javarush.test.level25.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Alex on 07.01.2016.
 */
public class Space {
    public static Space game;
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public double width;
    public double height;
    public SpaceShip ship;

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }

    ArrayList<Ufo> ufos = new ArrayList<>();
    ArrayList<Rocket> rockets = new ArrayList<>();
    ArrayList<Bomb> bombs = new ArrayList<>();

    public void run(){};
    public void draw(){};
    public void sleep(int ms){};


    public static void main(String[] args) {

    }
}
