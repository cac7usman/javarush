package com.javarush.test.level28.lesson15.big01;

import com.javarush.test.level28.lesson15.big01.model.Provider;
import com.javarush.test.level28.lesson15.big01.model.Strategy;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex on 05.05.2016.
 */
public class Controller

{
    private Provider[] providers;

    public Controller(Provider... providers) {
        if (providers == null || providers.length ==0) throw new IllegalArgumentException();
        this.providers = providers;
    }


    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }

    public void scan() {
        List<Vacancy> first_list = null;
        try {
            for (Provider provider : providers) {
                List<Vacancy> second_list = provider.getJavaVacancies("1");
                for (Vacancy vacancy : second_list) {
                    first_list.add(vacancy);
                }
            }
            System.out.println(first_list.size());



        } catch (NullPointerException e) {
            System.out.println("0");

        }
    }
}

