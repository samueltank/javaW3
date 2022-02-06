package com.w3schools.ecps.test.model;

public class Encapsulation
{
    private final String user; // atributo encapsulado;
    private String password; // atributo emcapsulado com a palavra-chave private;
    public Encapsulation(String user, final String password) // método construtor;
    {
        this.user = user;
        this.password = password;
    }

    // método get usado para retornar o valor de um atributo encapsulado;
    public String getUser() // deve ser publico e possuir a sintaxe: getName(); onde Name é do atributo;
    {
        return user;
    }

    // método get usado para retornar o valor de um atributo encapsulado;
    public String getPassword()
    {
        return password;
    }

    // método set usado para atribuir um valor a um atributo encapsulado;
    public void setPassword(String password) // deve ser publico e possuir a sintaxe: getName(parâmetros); onde Name é do atributo e ;
    {
        this.password = password;
    }
}
