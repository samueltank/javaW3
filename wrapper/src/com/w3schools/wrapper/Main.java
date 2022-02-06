package com.w3schools.wrapper;

public class Main {
    public static void main(String[] args) {
        /**
        * Classes wrapper são usadas para trabalhar com tipos primitivos em
         * formato de objeto(Construções de classes). Cada tipo primitivo
         * possui uma classe wrapper correspondente.
         *
         * As classes wrapper são muito utilizadas para a criação de
         * coleções, onde não é possível utilizar tipos primitivos, pois
         * coleções só podem armazenar objetos.
        * */

        Character char0 = 'a';
        Boolean boolean0 = false;
        Byte byte0 = 100;
        Short short0 = 10000;
        Double double0 = 120.2541112224445d;
        Float float0 = 100.3541111f;
        Long long0 = 10000000000L;
        Integer int0 = 10000000;

        // É possível converter wrapper para primitive:
        int int1 = int0.intValue();
        double double1 = double0.doubleValue();

        // É possível também converter um wrapper para String:
        String myString = float0.toString();
        System.out.println(myString.length());
    }
}
