package com.w3schools.ctcts.test.model;

public class Constructor
{
    public int x; // x = null;

    // atributos de construtor para parâmetros:
    public int ano;
    public String modelo;

    // *** SOBRECARGA DE CONSTRUTORES ***;

    public Constructor() // um construtor deve ter o mesmo nome da class; construtor sem parâmtros;
    {
        // quando o objeto for criado, o construtor é chamado;

        x = 15; // atribuição de valor à variável antes vazia;
    }

    public Constructor(int ano, String modelo) // os parâmetros devem ter o mesmo nome dos atributos;
    {
        // quando o objeto for criado, o construtor é chamado;

        // passagem de argumento int ano e String modelo para os atributos:

        this.ano = ano; // passagem de argumento do construtor ao atributo ano;
        this.modelo = modelo; // passagem de argumento do construtor ao atributo modelo;
    }
    // OBS: os construtores devem estar sempre dentro do bloco da classe que irão "construir".
}
