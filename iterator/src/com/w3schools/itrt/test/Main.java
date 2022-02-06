package com.w3schools.itrt.test;


import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        // coleção de marcas de carros(String):
        HashSet<String> carros = new HashSet<String>();
        carros.add("Ferrari");
        carros.add("Audi");
        carros.add("Mercedes");
        carros.add("Ford");

        // a variável iterCarros do tipo interator, recebe o iterator de carros;

        Iterator<String> iterCarros = carros.iterator();

        // imprime o primeiro objeto armazenado no iterator:
        System.out.println(iterCarros.next());

        // imprime todos os objetos armazenados no iterator:
        while (iterCarros.hasNext()) // enquanto houver um próximo objeto ele imprime esse próximo objeto;
        {
            System.out.println(iterCarros.next());
        }

        // coleção de números ímpares:
        HashSet<Integer> impares = new HashSet<>();
        impares.add(1);
        impares.add(3);
        impares.add(5);
        impares.add(7);
        impares.add(9);
        impares.add(11);

        // iterator para manipular a coleção impares:
        Iterator<Integer> iterImpares = impares.iterator();

        // remove todos os itens da coleção que seja menor que 10:
        while (iterImpares.hasNext())
        {
            Integer i = iterImpares.next();
            if (i < 5)
            {
                iterImpares.remove();
            }
        }
        System.out.println(impares);
    }
}
