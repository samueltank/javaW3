package com.w3schools.ens.test;

import java.util.logging.Level;

public class Main // enums podem implementar interfaces;
{
    // enums podem ser criados dentro de classes:
    enum Nivel
        // enums podem receber atributos(default: public, static e final);
    {
        BAIXO, MEDIO, ALTO;
    }

    public static void main(String[] args)
    {
        Nivel meuNivel = Nivel.ALTO;

        // enums são frequentemente usados em estruturas de escolha(switch):
        switch (meuNivel)
        {
            // estrutura "Nova":
            case BAIXO -> System.out.println("Nível Baixo!");
            case MEDIO -> System.out.println("Nível Médio!");
            case ALTO -> System.out.println("Nível Alto!");
        }

      /*  switch (meuNivel)
        {
            // estrutura antiga:
            case BAIXO:
                System.out.println("Nível Baixo!");
                break;
            case MEDIO:
                System.out.println("Nível Médio!");
                break;
            case ALTO:
                System.out.println("Nível Alto!");
                break;
        }*/

        // matriz de todas as constantes em um enum:
        System.out.println();
        System.out.println("Varredura de Matriz:");
        // for-each:
        for (Nivel varedura : Nivel.values())
        {
            System.out.println(varedura);
        }
    }
}
