package com.w3schools.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*
         * O pacote regEx do java.util serve para sanar necessidades de busca em
         * textos. Ela possui três classes, são elas: Pattern, Matcher e
         * PatternSyntaxException.
         *
         * A Classe Pattern serve para definir o valor em String a ser pesquisa em
         * outra String, com o método Pattern.compiler();
         *
         * A Classe Matcher serve para executar a pesquisa com base no pattern
         * definido anteriormente;
         *
         * Por fim, a classe PatternSyntaxException retorna exceções sobre os
         * padrões.
         */

        String texto = "-Samuel deve estudar sobre os valores da empresa e " +
                "formar pontes para conquistar a vaga desejada(isso alem de " +
                "ser capacitado)";
        Pattern padraoDePesquisa = Pattern.compile("Samuel");
        Matcher pesquisar = padraoDePesquisa.matcher(texto);
        boolean resultado = pesquisar.find();

        if (resultado) {
            System.out.println("Texto encontrado!");
        } else {
            System.out.println("Texto não encontrado!");
        }

        // Saída de texto via console:
        System.out.println(pesquisar.group());

        /*
        * Necessário se aprofundar no assunto pois o tema é amplo e as formas
        * de pesquisa são gariadas!
        */
    }
}
