package com.javarush.test.level25.lesson16.big01;

/**
 * Created by Alex on 07.01.2016.
 */
public class SpaceShip extends BaseObject{
    public SpaceShip(int x, int y){
        super(x, y, 3);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public void move() {
        x += dx;
    }


    public double dx = 0;

    public void moveLeft()
    {
        dx = -1;
    }
    public void moveRight()
    {
        dx = 1;
    }
}


/*
Теперь перейдем к методам draw, move
В методе move() надо:
а) увеличить x на dx
б) проверить, не вылез ли корабль за границы космоса [0, Space.game.getWidth()]
Учти, что ширина корабля равна двум его радиусам.

Метод draw я напишу сам - просто объяви пустой метод.

Еще нам понадобится метод fire(), ведь корабль умеет стрелять.
Этот метод вызывается, когда надо произвести выстрел.
В этом методе надо
а) создать две ракеты
б) установить им координаты левого края корабля и правого края корабля (пушки корабля находятся по краям)
в) добавить эти ракеты в список ракет объекта game.

Его можно получить так:
Space.game.getRockets()*/
