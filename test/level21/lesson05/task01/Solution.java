package com.javarush.test.level21.lesson05.task01;

import java.util.HashSet;
import java.util.Set;

/* Equals and HashCode
В классе Solution исправить пару методов equals/hashCode в соответствии с правилами реализации этих методов.
Метод main не участвует в тестировании.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solution solution = (Solution) o;

        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
        if (last != null ? !last.equals(solution.last) : solution.last != null) return false;

        return true;
    }

    public boolean equals(Solution n) {
        if (this == n)
        {
            return true;
        }
       if (n == null || n.getClass() != this.getClass()) {
           return false;}




        if (n.first.equals(first)) return true;
        if (n.last.equals(last)) return true;

        return true;

      /* if (first != null && n.first.equals(first) && last != null && n.last.equals(last));
        {return true;}*/
    }

    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((first == null) ? 0:first.hashCode())


        + ((last == null) ? 0: last.hashCode());

        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
