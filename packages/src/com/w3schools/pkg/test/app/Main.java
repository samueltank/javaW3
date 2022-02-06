package com.w3schools.pkg.test.app;

// import java.util.*; // importa todas as classes do pacote java.util;
import java.util.Scanner; // importa a classe Scanner do pacote java.util;

public class Main
{
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in); // cria um objeto "leitor" do tipo Scanner;

        System.out.print("Qual o seu nome completo?: ");
        String name = leitor.nextLine(); // este método do Scanner lê toda a linha digitada no console;

        System.out.println("Seu nome é: "+ name);
    }
}
