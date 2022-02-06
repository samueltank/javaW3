package com.w3schools.tc.test;

public class TypeCasting
{

    public static void main(String[] args)
    {
	    // Java type casting (conversão de tipos de dados);
        int myInt1 = 11;
        double myDouble1 = myInt1; // Automatic casting: int to double (de um tipo menor para um maior);

        System.out.println(myInt1);
        System.out.println(myDouble1);

        double myDouble2 = 254.25d;
        int myInt2 = (int) myDouble2; // Manual Casting: double to int (de um tipo maior para um menor);

        System.out.println(myDouble2);
        System.out.println(myInt2);
    }
}
