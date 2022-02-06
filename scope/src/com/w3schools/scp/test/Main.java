package com.w3schools.scp.test;

public class Main {

    public static void main(String[] args) {
	    // a variável x não pode ser acessada aqui!;

        { // bloco de código dentro de outro bloco;

            // a variável x não pode ser acessada aqui!;

            int x = 20;

            // a variável x pode ser acessada aqui!;

            System.out.println("A variável acessada: " + x);
        }
        // a variável x não pode ser acessada aqui!;
    }
}
