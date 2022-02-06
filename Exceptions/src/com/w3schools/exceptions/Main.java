package com.w3schools.exceptions;

public class Main {
    /**
    * O bloco de excecão try...catch serve para tratar erros em um bloco
    * específico. No try é colocado o bloco a ser observado, para que,
    * resultando em erro, o bloco catch trate o mesmo.
    * O bloco finally é executado independentemente dos dois blocos anteriores.
    * */
    static void checkAge(byte age) {
        if (age < 18) {
            // throw cria uma exceção personalizada.
            throw new ArithmeticException("Acesso negado!");
        } else {
            System.out.println("Acesso concedido!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge((byte)20);
        } catch (Exception e) {
            System.out.println("Houve um erro no chamado da função " +
                    "\"checkAge\"");
        } finally {
            System.out.println("O tratamento try...catch foi percorrido.");
        }
    }
}
