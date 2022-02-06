package com.w3school.atbt.test.app;

import com.w3school.atbt.test.model.Attribute;

import java.util.stream.StreamSupport;

public class Main // classe principal que chama outras;
{
    public static void main(String[] args)
    {
        // podemos mudar o valor de um atributo:

        Attribute instancia = new Attribute(); // instância da classe(que é chamado de objeto);
        instancia.x = 20; // alteração do valor do atributo do objeto 'instancia';
        instancia.y = 30; // alteração do valor do atributo do objeto 'instancia';
        instancia.z = 12; // atribuição de valor ao atributo z, que antes era null;

        Attribute instancia1 = new Attribute(); // segundo objeto 'instancia';
        Attribute instancia2 = new Attribute(); // terceito objeto 'instancia';

        instancia1.alteracaoValor = 10; // a alteração feita em um objeto se limita a ele, sem afetar outros objetos;
        System.out.println(instancia1.alteracaoValor); // o valor foi alterado;

        System.out.println();

        System.out.println(instancia2.alteracaoValor); // aqui o valor não foi alterado;

        System.out.println();

        System.out.printf("%s %s tem %s anos de idade!", instancia.name, instancia.sobrenome, instancia.idade);
    }
}
