package com.w3schools.wp.test;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // tipo inválido de ArrayList:
        /* ArrayList<int> pares = new ArrayList<int>(); <- é inválido porque uma lista só aceita objetos; */

        // tipo correto de ArrayList:
        ArrayList<Integer> pares = new ArrayList<Integer>(); // Integer é uma Wrapper Class(objeto de um tipo primitivo);

        // declaração de objetos de tipo primitivo:
        String nome = "Samuel Tank";
        Integer idade = 20;
        Double valorEmConta = 0.5;
        Character inicialName = 'S';
        System.out.println(nome);
        System.out.println(idade.intValue()); // objetos de tipo primitivo possuem métodos de retorno;
        System.out.println(valorEmConta.doubleValue());
        System.out.println(inicialName.charValue());

        // comversão de um objeto integer para String:

        Integer total = 25;
        String conversao = total.toString();
        System.out.println(conversao);
        System.out.println("Quantidade de caracteres: " + conversao.length());
    }
}
