package com.javarush.test.level28.lesson15.big01.model;

import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * Created by Alex on 05.05.2016.
 */
    public class HHStrategy implements Strategy {
    private static final String URL_FORMAT =  "http://hh.ua/search/vacancy?text=java+%s&page=%d";

    @Override
    public List<Vacancy> getVacancies(String searchString) {
        try
        {
            Document document = Jsoup.connect(URL_FORMAT).userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.94 Safari/537.36").referrer("none").get();

        }

        catch (IOException e)
        {

        }
        return Collections.emptyList();
    }
}
