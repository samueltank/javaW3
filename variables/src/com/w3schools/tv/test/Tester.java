package com.w3schools.tv.test;

public class Tester
{

    public static void main(String[] args) // método principal;
    {
        // declaração de variáveis; -Aqui as variáveis foram atribuídas antes, para posteriormente, receber valores;
        String name, firstName, lastName, fullName;
        int numInteiro, x, y, z;
        float numDecimal;
        final float soma; // esta variável só aceita o primeiro valor recebido. Caso outro valor tente oculpar o seu espaço, ERROR sejá retornado;

        name = "Samuel";
        System.out.println(name);

        numInteiro = 10;
        System.out.println(numInteiro);

        numDecimal = 15.5F; // necessário acrescentar o 'F' ou 'f' no final do número decimal utilizando o 'type float'
        System.out.println(numDecimal);

        soma = numDecimal * 3;

        System.out.println(soma);

        System.out.println("Hello " + name); // concatenação entre texto e variável;

        firstName = "Samuel";
        lastName = " Tank";
        fullName = firstName + lastName; // concatena os valores String das duas variáveis;
        System.out.println(fullName);

        x = 5;
        y = 6;
        System.out.println(x + y); // soma os valores, o '+' tem função de operador aritmético;

    }
}
