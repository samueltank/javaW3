package com.w3schools.lp.test;

public class Loop
{
    public static void main(String[] arg)
    {
        // loop while:

        System.out.println("Teste laço while: ");

        byte i = 1;

        while (i <= 5) // enquanto a condição for verdadeira, o bloco será executado;
        {
            System.out.println(i); // imprime  o valor atual da variável de controle;
            i++; // incremento (+1) necessário para limitar a quantidade de vezes que o bloco será executado;
        }

        System.out.println(); // espaço entre os loops;

        // loop do/while:

        System.out.println("Teste laço do/while: ");

        byte j = 10;

        do // executa o bloco pelo menos uma vez, antes de verificar a condição;
        {
            System.out.println(j);
            j++;
        }
        while (j < 5); // teste condicional depois da execução do bloco de código;

        System.out.println();

        // loop for:

        System.out.println("Teste laço For: ");

        for (byte n = 1;n <= 5;n++) // a declaração 1 é executada apenas uma vez, quanto as outras duas são executadas todas as vezes;
        {
            System.out.println(n);
        }

        // exemplo for para exibir números pares:

        System.out.println("Exibe pares entre 0 e 10: ");

        for (int x = 0;x <= 10;x = x + 2)
        {
            System.out.println(x);
        }

        // exemplo for para exibir números ímpares:

        System.out.println("Exibe ímpares entre 0 e 10: ");

        for (int y = 1;y <= 10;y = y + 2)
        {
            System.out.println(y);
        }

        System.out.println();

        // exemplo de for-each loop:

        String[] car = {"Volvo", "BMW", "Ford","Mazda"}; // declaração de Array do tipo String;
        for (String k : car) // for-each lista os elementos do array;
        {
            System.out.println(k); // exibi o elemento k;
        }

        System.out.println();

        // exemplo de uso do break em loop:

        System.out.println("loop que termina a alcançar um determinado valor: ");

        for (int a = 0;a <= 10;a++)
        {
            if (a == 5) // quando a variável de controle for igual a 5, o laço será interrompido;
            {
                break; // sai do laço;
            }
            System.out.println(a);
        }

        System.out.println();

        // exemplo de uso do continue em loop:

        System.out.println("Uso do continue para pular o número 5");

        for (int b = 0;b <= 10;b++)
        {
            if (b == 5) // caso a b seja igual a 5, o continue interrompe a iteração da b;
            {
                continue; // iterrompe a iteração(pula o 5 e continua no 6);
            }
            System.out.println(b);
        }

        System.out.println();

        // exemplo de excessões com for, switch, continue:

        System.out.println("Sequência com excessões: ");

        for (int f = 0; f <= 10;f++)
        {
            switch (f)
            {
                case 0,1,3: // nesses casos, não é necessário break pois o continue já sai do bloco;
                    continue;
                default:
                    System.out.println(f);
            }
        }
    }
}
