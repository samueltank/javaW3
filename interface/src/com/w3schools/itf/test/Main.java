package com.w3schools.itf.test;

interface PiscarFarol // interfaces são abstratas, ou seja, não podem ser usadas como objetos;
{
    String cor1 = "Verde", cor2 = "Amarelo", cor3 = "Vermelho"; // atributos de interfaces são, por padrão: publicos, estáticos e final;
    void piscarVerde(); // por padrão os métodos de uma interface são por padrão: publicos e abstratos;
    void piscarAmarelo();
    void piscarVermelho();
}

interface ManterFarol
{
    int tempoAceso = 20;
    void manterVerde();
    void manterAmarelo();
    void manterVermelho();
}

class Farol implements PiscarFarol, ManterFarol // implementação multipla de interfaces com o token "implements" e separação das interfaces por vírgula(,);
{
    public void piscarVerde()
    {
        System.out.println("Piscando " + cor1);
    }

    public void piscarAmarelo()
    {
        System.out.println("Piscando " + cor2);
    }

    public void piscarVermelho()
    {
        System.out.println("Piscando " + cor3);
    }

    public void manterVerde()
    {
        System.out.println("Mantendo o farol "+ cor1 +" por " + tempoAceso + " segundos...");
    }

    public void manterAmarelo()
    {
        System.out.println("Mantendo o farol "+ cor2 +" por " + tempoAceso + " segundos...");
    }

    public void manterVermelho()
    {
        System.out.println("Mantendo o farol " + cor3 + " por " + tempoAceso + " segundos...");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Farol objeto = new Farol();
        objeto.manterVerde();
        objeto.piscarVerde();
        objeto.manterAmarelo();
        objeto.piscarAmarelo();
        objeto.manterVermelho();
        objeto.piscarVermelho();
    }
}
