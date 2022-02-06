package com.w3schools.mdf.test.app;

public class Segunda
{
    public static void main(String[] args)
    {
        Estudante objeto = new Estudante();

        System.out.println(objeto.name);
        System.out.println(objeto.idade);
        System.out.println(objeto.nascimento);

        objeto.estudar();
    }
}
