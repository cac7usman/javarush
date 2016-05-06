package com.javarush.test.level26.lesson15.big01;

import java.util.*;

/**
 * Created by Alex on 19.02.2016.
 */
public final class CurrencyManipulatorFactory {
    Map<Integer, Integer> manipulators = new HashMap<>();


}

/*
* 2. Валют может быть несколько, поэтому нам понадобится фабрика, которая будет создавать и хранить манипуляторы.
Создадим класс CurrencyManipulatorFactory со статическим методом getManipulatorByCurrencyCode(String currencyCode).
В этом методе будем создавать нужный манипулятор, если он еще не существует, либо возвращать ранее созданный.
Подумайте, где лучше хранить все манипуляторы.
Сделайте так, чтобы невозможно было создавать объекты CurrencyManipulatorFactory класса*/
