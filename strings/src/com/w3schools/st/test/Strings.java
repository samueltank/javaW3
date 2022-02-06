package com.w3schools.st.test;

public class Strings
{
    public static void main(String[] args)
    {
        // podemos contar a quantidade de caracteres existentes em uma String com o método length();
        String contagem = "Pizza é a melhor invenção da humanidade";
        System.out.printf("A String 'contagem' possui: %d caracteres\n", contagem.length()); /* o método sem parâmetros conta os espaços entre as
        palavras; */

        // podemos usar métodos para deixar toda a String maiúscula ou minúscula;
        String textoMaiusculo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Conteúdo da String em maiúsculo: " + textoMaiusculo.toUpperCase());
        System.out.println("Conteúdo da String em minúsculo: " + textoMaiusculo.toLowerCase());

        // podemos retorna um íntice de um palavra em uma String;
        String name = "Samuel Tank";
        System.out.printf("A palavra \"Tank\" está no índice: %d\n", name.indexOf("Tank")); // retorna 7, que é o indice da palavra;

        String nome = "Samuel";
        String sobrenome = " Tank";
        System.out.println(nome.concat(sobrenome));

        // String podem receber caracteres de escape com contrabarra como:
        // \' = ' (single quote);
        // \" = " (double quote);
        // \\ = \ (backslash);
        // \n = nova linha;
        // \r = retorno de carro;
        // \t = tab space;
        // \b = backspace;
        // \f = form feed;

        String hashcode = "Samuel Tank";
        System.out.println(hashcode.hashCode());
    }
}
