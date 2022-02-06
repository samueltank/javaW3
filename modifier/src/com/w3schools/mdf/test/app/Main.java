package com.w3schools.mdf.test.app;

abstract class Main // classes e métodos abstratos devem estar sempre no mesmo package do main, para funcionar corretamente;
{
    public String name = "Samuel";
    public int idade = 20;

    public abstract void estudar();

}


class Estudante extends Main // subclasse Estudante do Main;
{
    public int nascimento = 2000;

    public void estudar()
    {
        System.out.println("Estudar Java até conquistar a proeficiência!");
    }
}