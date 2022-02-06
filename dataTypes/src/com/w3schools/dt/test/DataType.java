package com.w3schools.dt.test;

public class DataType
{
    public static void main(String[] args)
    {
        // SEMPRE comece os identificadores primitivos com letras minúsculas e os não primivos com maiúsculas;

        byte num0 = 100; // byte vai de -128 a 127 (economiza memória);
        System.out.println(num0);

        short num1 = 10000; // short vai de -32.768 a 32.767;
        System.out.println(num1);

        int num2 = 1000000; // int vai de -2.147.483.648 a 2.147.483.647 (é o valor mais usado para inteiros);
        System.out.println(num2);

        long num3 = 1000000000000000000L; // long vai de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 (use "L" no final do valor);
        System.out.println(num3);

        float num4 = 25.6f; // float vai de 3.4e-038 a 3.4e + 038 (use "f" no final do valor);
        System.out.println(num4);

        double num5 = 3.141d; // double vai de 1,7e-308 a 1,7e + 308 (use "d" no final do valor);
        System.out.println(num5);

        float f1 = 3.5e3f; // retorna no console o número completo (resultado da notação ciêntífica);
        System.out.println(f1);
        double f2 = 3.5E3d; // variante com "E"; sempre coloque "d" no final do valor double;
        System.out.println(f2);

        char myGrade = 'B'; // o valor da variável do tipo char deve ser contida dentro de aspas simples 'B';
        System.out.println(myGrade);

        char a = 65, b = 66, c = 67; // é possível usar valores da tabela ASCII para expressar números
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // dados do tipo primitivo necessitam de uma valor inicial, enquanto variáveis do tipo não primitivo podem receber null;
    }
}
