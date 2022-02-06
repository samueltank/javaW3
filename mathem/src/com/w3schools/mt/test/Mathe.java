/*

 */

package com.w3schools.mt.test;

import java.lang.Math; // necessário importar a class java.lang.Math para operações matemáticas;

public class Mathe
{
    public static void main(String[] args)
    {
        int a = 10, b = 15; // declaração de variáveis;
        short c = 64, d = -100;

        System.out.println(Math.max(a, b)); // retorna o maior entre dois números; MÉTODO RECEBE NO MÁXIMO, DOIS VALORES COMO PARÂMETROS;
        System.out.println(Math.min(a, c)); // retorna o menor entre dois números; MÉTODO RECEBE NO MÁXIMO, DOIS VALORES COMO PARÂMETROS;

        System.out.println(Math.sqrt(c)); // retorna a raiz quadrada de um número(retorna double); MÉTODO RECEBE NO MÁXIMO, UM VALOR COMO PARÂMETRO;
        System.out.println(Math.abs(d));  // retorna o valor absoluto de um número; MÉTODO RECEBE NO MÁXIMO, UM VALOR COMO PARÂMETRO;

        // Números aleatórios pelo objeto Math:

        // O método Math.random() retorna por padrão uma número pseudo-aleatório entre 0,0 (inclusivo) e 1.0 (exclusivo);
        /*
        Para melhor controle da formação dos números aleatórios precisamos fazer uma variável inteira e converter o resultado de uma multiplicação
        entre o resultado do método random() e o valor limite dos possíveis números + 1, como no exemplo a seguir:
        */

        int numRandom = (int) (Math.random() * 51); // gera um número pseudo-aleatótio de 0.0 a 0.9 que é multiplicado por 51;
        System.out.println(numRandom);
    }
}
