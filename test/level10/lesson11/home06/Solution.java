package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private String surname;
        private boolean sex;
        private Date dateofbirth;
        private int salary;
        private int id;

        public Human()
        {

        }
        public Human(int id)
        {
            this.id = id;
        }

        public Human (String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }

        public Human (boolean sex)
        {
            this.sex = sex;
        }
        public Human (String name, String surname, boolean sex)
        {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }
        public Human (String name, String surname, Date dateofbirth)
        {
            this.name = name;
            this.surname = surname;
            this.dateofbirth = dateofbirth;
        }
        public Human (String name, String surname, int salary, Date dateofbirth)
        {
            this.name = name;
            this.surname = surname;
            this.salary = salary;
            this.dateofbirth = dateofbirth;
        }
        public Human (String name, String surname, boolean sex, Date dateofbirth)
        {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.dateofbirth = dateofbirth;
        }
        public Human (String name, String surname, boolean sex, Date dateofbirth, int salary)
        {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.dateofbirth = dateofbirth;
            this.salary = salary;

        }
        public Human (String name, String surname, boolean sex, Date dateofbirth, int salary, int id)
        {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.dateofbirth = dateofbirth;
            this.salary = salary;
            this.id = id;
        }



        //напишите тут ваши переменные и конструкторы
    }



}
