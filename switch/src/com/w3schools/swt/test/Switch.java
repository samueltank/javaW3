package com.w3schools.swt.test;

public class Switch
{
    public static void main(String[] args)
    {
        // switch para escolher blocos de códigos correspondentes a uma expressão:
        byte dia = 7;

        switch (dia)
        {
            case 1: // caso dia == 1 ...
                System.out.println("Segunda-feira!");
                break; // o comando break é opcional; o break poupa tempo de execução! (no caso do switch);
            case 2: // caso dia == 2 ...
                System.out.println("Terça-feira!");
                break;
            case 3:
                System.out.println("Quarta-feira!");
                break;
            case 4:
                System.out.println("Quinta-feira!");
                break;
            case 5:
                System.out.println("Sexta-feira!");
                break;
            case 6:
                System.out.println("Sábado!");
                break;
            case 7:
                System.out.println("Domingo!");
                break;
            default: // caso não encontre blocos correspondentes, o bloco default é executado;
                System.out.println("Não achei bloco de código correspondente...");
        }
    }
}
