package com.javarush.test.level15.lesson12.home05;

/**
 * Created by asus on 27.08.2015.
 */
public class SubSolution extends Solution
{
    public SubSolution()
    {
    }

    public SubSolution(String s)
    {
        super(s);
    }

    public SubSolution(Integer n)
    {
        super(n);
    }

    protected SubSolution(int n)
    {
        super(n);
    }

    protected SubSolution(char c)
    {
        super(c);
    }

    protected SubSolution(byte b)
    {
        super(b);
    }

    private SubSolution(short s)
    {
        super(s);
    }

    private SubSolution (Double d)
    {
        super(d);
    }
    private SubSolution (Float f)
    {
        super (f);
    }

    SubSolution(Object o)
    {
        super(o);
    }

    SubSolution(int n, float f)
    {
        super(n, f);
    }

    SubSolution(Object o, String s)
    {
        super(o, s);
    }
}
