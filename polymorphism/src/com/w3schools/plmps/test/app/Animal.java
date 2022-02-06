package com.w3schools.plmps.test.app;

public class Animal
{
    protected void somAnimal()
    {
        System.out.println("O animal faz um som...");
    }
}

class Porco extends Animal
{
    protected void somAnimal()
    {
        System.out.println("~Ohnk, ohnk!~");
    }
}

class Cachorro extends Animal
{
    protected void somAnimal()
    {
        System.out.println("~Au, au!~");
    }
}

class Gato extends Animal
{
    protected void somAnimal()
    {
        System.out.println("~Maiu, miua!~");
    }
}

