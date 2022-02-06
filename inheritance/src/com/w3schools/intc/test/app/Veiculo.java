package com.w3schools.intc.test.app;

public class Veiculo // superclasse, pois tem um filho(subclasse) Carro;
{
    protected String marca = "Ford"; // protected permite acesso no mesmo pacote, mas não fora;
    public void buzinar()
    {
        System.out.println("Bii, Biii!");
    }
}

class Carro extends Veiculo // Carro é uma subclasse de Veiculo;
{
    private String nomeModelo = "Mustang"; // private permite acesso apenas na classe pertencente; mas não no mesmo pacote nem fora dele;

    public static void main(String[] args)
    {
        Carro carro = new Carro(); // este objeto herda os atributos e métodos do pai;
        carro.buzinar(); // método do pai;

        System.out.println(carro.marca + " " + carro.nomeModelo);
    }
}
