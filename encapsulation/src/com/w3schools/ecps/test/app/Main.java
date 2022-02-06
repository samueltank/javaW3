package com.w3schools.ecps.test.app;

import com.w3schools.ecps.test.model.Encapsulation;

public class Main
{
    public static void main(String[] args)
    {
        Encapsulation objeto = new Encapsulation("Samueltank","Samu123!");
        System.out.println(objeto.getUser());
        System.out.println(objeto.getPassword());

        System.out.println();

        // alteração de senha;
        objeto.setPassword("Samu123456!");

        System.out.println("alteração de senha do usuário:");
        System.out.println(objeto.getUser());
        System.out.println(objeto.getPassword());

    }
}
