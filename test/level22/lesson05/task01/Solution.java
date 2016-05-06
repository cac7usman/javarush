package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {


        if (string == null)
            throw new TooShortStringException();
        int countN = 0;

        for (char element : string.toCharArray()) {
            if (element == ' ') countN++;
        }
        if (countN < 4 || countN<3 || countN<2 || countN<1 || countN==0) throw new TooShortStringException();

        int spaces = 0;
        int lastIndex = 0;
        char[] c = string.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') spaces++;
            if (spaces >= 5) break;
            lastIndex = i;
        }

        int index = string.indexOf(" ");
        string = string.substring(index + 1, lastIndex + 1);


        return string;
    }

    public static class TooShortStringException extends Exception {


    }


    public static void main(String[] args) throws TooShortStringException {

        //System.out.println(getPartOfString(null));

        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }
}
