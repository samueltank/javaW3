package com.w3schools.abstn.test;


// classe abstrata;
abstract class Animal
{
    // atributo protegido da classe Animal;
    protected String animalName;
    public void setAnimalName(String animalName) // método de alteração do valor de um atributo;
    {
        this.animalName = animalName;
    }

    public String getAnimalName() // método de retorno do valor contido em um atributo;
    {
        return animalName;
    }

    public abstract void animalSound(); // método abstrato(corpo definido pela classe herdada);
    public void sleep() // método comum dentro de uma classe abstrata(completamente possível);
    {
        System.out.println("ZzzZzzZzz...");
    }
}

class Cachorro extends Animal // classe herdada(filha) da superclass(pai) "Animal";
{
    public void animalSound()
    {
        System.out.println("O cachorro faz: Au au!");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Cachorro cachorro = new Cachorro();
        cachorro.setAnimalName("Doguin");
        System.out.println("Nome do cachorro: " + cachorro.getAnimalName());
        cachorro.animalSound();
        cachorro.sleep();
    }
}
