package com.w3schools.prmt.test;

public class ParametrosArgumentos
{

    // método criado para pular uma linha:

    static void pularLinha()
    {
        System.out.println();
    }

    // método com parâmetros e argumentos:

    static void myMethod(String parametro)
    {
        System.out.println(parametro + " Refsnes");
    }

    // método com parâmetros multiplos:

    static void nomeando(String primeiroNome, String sobreNome, int idade)
    {
        System.out.printf("%s %s tem %s anos de idade!", primeiroNome, sobreNome, idade);
    }

    // métodos com retorno:

    static int somar(int x, int y) // ao invés do retorno ser void(vazio) ele retorna um int que substitui o void na estrutura;
    {
        return x + y; // retorna a soma que é do tipo int;
    }

    static int subtrair(int x, int y) // as variáveis declaradas como parâmetro são de scopo LOCAL;
    {
        return x - y; // retorna a subtração entre x e y;
    }

    // método com condicional incorporada:

    static String verificadorIdade(int idade) // método com retorno String;
    {
        String acesso = (idade < 18) ? "Acesso Negado!" : "Acesso Permitido!";
        return acesso;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) // método principal da aplicação;
    {

        // chamada de método e passe de argumentos:

        myMethod("Samuel"); // A String passada é chamada de argumento; argumento: "Samuel";
        myMethod("Julia"); // argumento: "Julia";
        myMethod("Gabriel"); // argumento: "Gabriel";

        pularLinha(); // método para pular linha;

        // chamada de método e passe de argumentos multiplos:

        nomeando("Samuel", "Tank", 20);

        // soma entre dois números:

        pularLinha();

        System.out.println("Retorno da soma entre 10 e 5: " + somar(10, 5));

        pularLinha();

        // armazenamento do retorno de um método em uma variável:

        byte retorno = (byte) (subtrair(10, 5)); // estreitamento de casting;
        System.out.println("Retorno da subtração entre 10 e 5: " + retorno);

        pularLinha();

        // teste de acesso por método com condicional:

        System.out.println("Acesso permitido para maiores de idade: " + verificadorIdade(15));
    }
}
