package com.w3schools.hss.test;

import java.util.Collections;
import java.util.HashSet;

public class Main
{
    private static void pularLinha()
    {
        System.out.println();
    }

    public static void main(String[] args)
    {
        HashSet<String> cores = new HashSet<String>();
        cores.add("Azul");
        cores.add("Roxo");
        cores.add("Verde");
        cores.add("Rosa");
        cores.add("Azul"); // como HashSet só aceita objetos diferentes, terá apenas 1 Azul na matriz;

        System.out.println(cores);

        pularLinha();

        String corSelecionada = "Laranja";
        System.out.println(cores.contains(corSelecionada)); // retorna true se o argumento for igual a algum objeto na matriz;

        pularLinha();

        if (cores.contains(corSelecionada))
        {
            System.out.printf("A cor %s está contida no objeto cores!\n", corSelecionada);
        }
        else
        {
            System.out.printf("A cor %s não está contida no objeto cores!\n", corSelecionada);
        }
        pularLinha();

        // remove um item do objeto cores:
        cores.remove("Azul"); // para remover todos os objetos do objeto cores use: cores.clear();
        System.out.println(cores);

        pularLinha();

        // para descobrir quantos "itens" há no objeto cores use: cores.size();
        System.out.println(cores.size());

        pularLinha();

        // loop for-each:

        for (String i : cores)
        {
            System.out.println(i);
        }
    }
}
