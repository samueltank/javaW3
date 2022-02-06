package com.w3schools.rcs.test;

public class Recursion
{

    public static void main(String[] args)
    {
	    int resultado = somar(5, 10);
        System.out.println(resultado);
    }

    public static int somar(int start, int end)
    {
        if (end > start)
        {
            return end + somar(start, end - 1);
        }
        else
        {
            return end;
        }
    }
}
