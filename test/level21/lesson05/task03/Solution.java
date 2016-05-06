package com.javarush.test.level21.lesson05.task03;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* Ошибка в equals/hashCode
Исправьте ошибки реализаций методов equals и hashCode для класса Solution
*/
public class Solution {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution solution;

    public Solution(int anInt, String string, double aDouble, Date date, Solution solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solution solution1 = (Solution) o;

        if (Double.compare(solution1.aDouble, aDouble) != 0) return false;
        if (anInt != solution1.anInt) return false;
        if (date != null ? !date.equals(solution1.date) : solution1.date == null) return false;
        if (solution != null ? !solution.equals(solution1.solution) : solution1.solution == null) return false;
        if (string != null ? !string.equals(solution1.string) : solution1.string == null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = anInt;
        result = 31 * result + (string != null ? string.hashCode() : 0);
        temp = Double.doubleToLongBits(aDouble);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Date currentDate = new Date();

        Solution childSolution = new Solution(1, "ChildSolution", +0.0d, currentDate, null);
        Solution parentSolution1 = new Solution(2, "ParentSolution", -0.0d, currentDate, childSolution);
        Solution parentSolution2 = new Solution(2, "ParentSolution", -0.0d, currentDate, childSolution);

        Set<Solution> set = new HashSet<Solution>();
        set.add(parentSolution1);

        System.out.println("HashCode1: " + parentSolution1.hashCode());
        System.out.println("HashCode2: " + parentSolution2.hashCode());
        System.out.println("Equals: " + parentSolution1.equals(parentSolution2));
        System.out.println("Contains: " + set.contains(parentSolution2));
        System.out.println("null: " + parentSolution1.equals(null));

        set.add(parentSolution2);
        System.out.println("Set size: " + set.size());
    }
}
