package com.w3schools.exptn.test;

public class Main
{
    // função de exceção personalizada:
    private static  void checkIdade(int idade)
    {
        if (idade < 18)
        {
            throw new ArithmeticException("Acesso negado!"); // cria um objeto de erro aritmético personalizado;
        }
        else
        {
            System.out.println("Acesso concedido!");
        }
    }

    public static void main(String[] args)
    {
        // tratativas de exceções:

        try // bloco portador de exceção:
        {
            int[] numeros = {1, 4, 5, 10};
            System.out.println(numeros[4]);
        }
        catch (Exception e) // tratativa de exceção:
        {
            System.out.println("Deu um erro aqui!");
        }
        finally // bloco de tratativa final(é executado independentemente do resultado do try..catch):
        {
            System.out.println("try..catch finalizado!");
        }

        checkIdade(17);
    }
}
