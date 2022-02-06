package com.w3schools.lambda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(12);
        numbers.add(45);
        numbers.add(90);
        numbers.add(100);
        numbers.add(6);

        // Listar todos os itens da lista com uma função Lambda:
        numbers.forEach((n) -> {
            System.out.println(n);
        });

        // Podemos litar is itens com uma referência de método:
         numbers.forEach(System.out::println);
    }
}
