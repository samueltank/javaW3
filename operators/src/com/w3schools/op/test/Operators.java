package com.w3schools.op.test;

public class Operators
{
    public static void main(String[] args)
    {
        short num1 = 100 + 25; // retorna 125;
        short num2 = (short) (num1 + 100); // retorna 225; necessita Casting;
        short num3 = (short) (num1 + num2); // retorna 350; necessita Casting;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        byte x = 5, y = 10;

        byte addition = (byte) (x + y); // soma x e y;
        System.out.println(addition);

        byte subtraction = (byte) (x - y); // subtrai y de x;
        System.out.println(subtraction);

        byte multiplication = (byte) (x * y); // multiplica x por y;
        System.out.println(multiplication);

        float division = (x / y); // divide x por y;
        System.out.println(division);

        byte modulus = (byte) (x % y); // retorna o resto da divisão de x por y;
        System.out.println(modulus);

        byte increment = ++x;
        System.out.println(increment); // incrementa 1 (+1) à variável x;

        byte decrement = --y;
        System.out.println(decrement); // decrementa 1 (-1) à variável y;

    }
}
