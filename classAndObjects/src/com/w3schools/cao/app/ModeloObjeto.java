package com.w3schools.cao.app;

import com.w3schools.cao.model.Main;

public class ModeloObjeto
{
    int x = 5; // atributo das classes;

    public static void main(String[] args)
    {
        ModeloObjeto meuObjeto = new ModeloObjeto(); // criação do objeto meuObjeto; primeiro objeto;
        ModeloObjeto meuObjeto1 = new ModeloObjeto(); // segundo objeto;
        System.out.println(meuObjeto.x); // imprime o atributo x do objeto meuObjeto;
        System.out.println(meuObjeto1.x); // imprime o atributo x do objeto meuObjeto1;

        // chamada a uma class em outro package:

        Main novoObjeto = new Main(); // criação do objeto novoObjeto;
        System.out.println(novoObjeto.x); // imprime o atributo do objeto;
    }
}
