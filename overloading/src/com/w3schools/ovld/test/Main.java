package com.w3schools.ovld.test;

public class Main
{
    // criação de método sobrecarregado:

    public static int somar(int x, int y) // parâmetros int;
    {
        return x + y;
    }

    public static double somar(double x, double y) // parâmetros double;
    {
        return x + y;
    }

    public static void main(String[] args)
    {
        int num1 = somar(10, 25); // chamada ao método somar() com parâmetros int;
        double num2 = somar(25.124, 25.14567); // chamada ao método somar() com parâmetros double;

        System.out.println("Soma entre inteiros: " + num1);
        System.out.println("Soma entre decimais: " + num2);
    }
}
