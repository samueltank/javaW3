package com.w3schools.rcs.test;

public class Recursao // classe renoameada;
{

    public static void main(String[] args) //  método principal de chamada;
    {
	    int result = sum(5); // armazenamento de retorno do método recursivo sum;
        System.out.println(result); // printa no console o valor do result;
    }

    public static int sum(int k) // criação de método com parâmetro int;
    {
        if (k > 0)
        {
            return k + sum(k - 1); // retorno que chama a função, tornando-a recursiva(função que chama ela mesma);
        }
        else
        {
            return 0; // retorna 0 caso o valor de k chegue em 0;
        }
    }
}
