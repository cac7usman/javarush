package com.javarush.test.level24.lesson04.home01;

/* Рефакторинг
В классе Rectangle:
1. Измените методы castToHasHeight и castToHasWidth, чтобы они возвращали HasHeight и HasWidth соответственно.
2. Для этого внутри методов castToHasHeight и castToHasWidth создайте локальные классы - реализации интерфейсов.
3. Переименуйте castToHasHeight в castToHasHeight, castToHasWidth в castToHasWidth (на имени метода нажмите Shift+F6).
4. Уберите наследование интерфейсов в классе  Rectangle.
Методы интерфейсов не менять.
*/
public class Solution {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);

        System.out.println(getHeight(rectangle.castToHasHeight()));
        System.out.println(getWidth(rectangle.castToHasWidth()));
    }

    public static double getHeight(HasHeight rectangle) {
        return rectangle.getHeight();
    }

    public static double getWidth(HasWidth rectangle) {
        return rectangle.getWidth();
    }


    public static class Rectangle {
        private Point point1;
        private Point point2;

        public Rectangle(double x1, double y1, double x2, double y2) {
            point1 = new Point(x1, y1);
            point2 = new Point(x2, y2);
        }

        public HasHeight castToHasHeight() {

            class LocalHeight implements HasHeight {

                public double getHeight() {
                    return Math.abs(point1.getY() - point2.getY());
                }
            }
            return new LocalHeight();
        }

        public HasWidth castToHasWidth() {
            class LocalWidth implements HasWidth {


                public double getWidth() {
                    return Math.abs(point1.getX() - point2.getX());
                }
            }
            return new LocalWidth();
        }
    }
}