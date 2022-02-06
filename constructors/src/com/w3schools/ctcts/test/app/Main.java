package com.w3schools.ctcts.test.app;

import com.w3schools.ctcts.test.model.Constructor;

public class Main
{
    public static void main(String[] args)
    {
        // criação de objeto para teste de construtor:

        Constructor objeto = new Constructor(); // construtor sem parâmetros;
        System.out.println(objeto.x);

        // criação de objeto com construtor com parâmetros:

        Constructor objeto1 = new Constructor(1969, "Mustang");
    }
}
