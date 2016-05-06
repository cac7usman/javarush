package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень,
земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String>map = new HashMap<String, String>();
        map.put("арбуз", "ягода");//Напишите тут ваш код
        map.put("банан", "трава");//Напишите тут ваш код
        map.put("вишня", "ягода");//Напишите тут ваш код
        map.put("груша", "фрукт");//Напишите тут ваш код
        map.put("дыня", "овощ");//Напишите тут ваш код
        map.put("ежевика", "куст");//Напишите тут ваш код
        map.put("жень-шень", "корень");//Напишите тут ваш код
        map.put("земляника", "ягода");//Напишите тут ваш код
        map.put("ирис", "цветок");//Напишите тут ваш код
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet())
        {
        String key = pair.getKey();
        String value = pair.getValue();
            System.out.println(key+" - "+value);//Напишите тут ваш код
        }

    }
}
