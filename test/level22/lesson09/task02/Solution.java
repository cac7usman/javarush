package com.javarush.test.level22.lesson09.task02;

import java.util.*;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {


    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        if (params == null || params.size() == 0)
            return stringBuilder;
        String prefix = " and ";

        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() != null) {
                stringBuilder.append(entry.getKey() + " = '" + entry.getValue() + "'" + prefix);
            }
        }


        stringBuilder.setLength(stringBuilder.length() - 5);


        return stringBuilder;
    }
}
