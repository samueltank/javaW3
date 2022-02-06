package com.w3schools.plmps.test.app;

public class Main
{
    public static void main(String[] args)
    {
        Animal porco = new Porco();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        porco.somAnimal();
        cachorro.somAnimal();
        gato.somAnimal();
    }
}
