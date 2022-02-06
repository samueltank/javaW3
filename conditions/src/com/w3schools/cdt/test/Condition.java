package com.w3schools.cdt.test;

public class Condition
{
    public static void main(String[] args)
    {
        // condicionais são usadas para executar um determindo número de blocos de cógido se uma certa condição for verdadeira ou falsa;
        // condicional 'if':

        byte i = 10, j = 20;

        if (j > i) // se j é maior que i? ou, j é menor que i?
        {
            System.out.println(j > i); // retorna true;
        }
        else
        {
            System.out.println(j < i); // retorna false;
        }


        byte hora = 20;

        if (hora <= 12)
        {
            System.out.println("Bom Dia!");
        }
        else if (hora < 18)
        {
            System.out.println("Boa Tarde!");
        }
        else
        {
            System.out.println("Boa Noite!");
        }

        // operador ternário:
        boolean acesso = false;
        String saida = (acesso == true) ? "Acesso permitido!" : "Acesso negado!"; // a primeira saída é true e a segunda é false;
        System.out.println(saida);

        // teste de maioridade com ternário:
        byte idade = 14;
        String acessor = (idade >= 18) ? "O jovem é maior de idade!" : "O jovem é menor de idade!";
        System.out.println(acessor);
    }
}
