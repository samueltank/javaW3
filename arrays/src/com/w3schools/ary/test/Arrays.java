package com.w3schools.ary.test;

public class Arrays
{
    public static void main(String[] args) // métido main que é responsável por chamar outras classes e criar objetos;
    {
        // TODA ATRIBUIÇÃO DO  CÓDIGO É FEITA COM O MÉTODO HARD CODE;
        // criação de matriz de String (hard code):

        String[] cars = {"Volvo", "Mercedes", "BMW", "Audi"}; // matriz do tipo String;índices começam em 0;
        System.out.println(cars[2]); // retorna o conteúdo do índice 2;

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        // criação de metriz de Inteiros (hard code):

        int[] numeros = {10,20,30,40}; // matriz do tipo int;
        System.out.println(numeros[0]); // retorna o conteúdo do índice 0;

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        // alterando o elemento de um array:

        int[] num = {10,20,30,40,50};
        num[0] = 15; // o valor do índice 0 da matriz receberá 15 e perderá o 10;
        System.out.println(num[0]);

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        // comprimento de uma matriz:

        String[] irmaos = {"Gabriel", "Rebeca", "Ellen", "Emanuel", "Ana Julia"};
        System.out.printf("O total de índices da matriz é: %d\n", irmaos.length); /* é utilizado o método .length para retornar o total de
        índices localizados na matriz(no caso são 5); */

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        // exemplo de varredura de matriz com o método length e o laço for:

        int[] listaVarredura = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // declaração da matriz unidimensional do tipo inteiro;
        System.out.print("Varreduta: ");
        for (int i = 0; i < listaVarredura.length; i++) // o for precisa começar do 0 pois é o equivalente ao primeiro índice;
        {
            System.out.print(listaVarredura[i] + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        // percorrendo uma matriz com o for-each:

        String[] animaisFavoritos = {"Macaco", "Elefante", "Gabriel", "Cavalo", "Cachorro", "Furão"};
        for (String i : animaisFavoritos) /* String i é usado para armazenar na memória o conteúdo do índice atual(no loop); o loop é executado
        até que toda a matriz seja "varrida"; */
        {
            System.out.println(i); // a cada loop o conteúdo da variável i é impresso no console;
        }

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        // somando o conteúdo de uma matriz do tipo inteira com o for-each:

        int[] numInt = {3, 9, 11, 25, 14, 31, 1};
        int soma = 0;
        for (int i : numInt)
        {
            System.out.print(i);
            soma = (soma + i);
        }
        System.out.printf("\nA soma entre os números da matriz é: %d", soma);

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        // matrizes multidimensionais:

        System.out.print("Matrizes multidimensionais: ");
        int[][] numImpPar = {{3, 9, 11, 13, 15}, {2, 4, 8, 12, 20}}; // matriz de duas dimensões;
        System.out.println(numImpPar[1][4]); // retorna o valor do índice 4 da matriz 1 (O número da matriz começa em 0 e o índice também);
        System.out.println(numImpPar.length);

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println();

        // varrendo uma matriz multidimensional com for:

        System.out.print("Varredura de matriz multidimencional: ");
        int[][] unidadesDezenas = {{1, 2, 3, 4, 5, 6}, {11, 13, 15, 16, 27, 55}}; // criação de uma matriz multidimensional de duas dimenções;
        for(int i = 0; i < unidadesDezenas.length; i++) // loop do valor correspondente a matriz;
        {
            for (int j = 0; j < unidadesDezenas[i].length; j++) // loop correspondente ao índice;
            {
                System.out.print(unidadesDezenas[i][j]); // impressão no console do valor correspondente [matriz][índice];
            }
        }
    }
}