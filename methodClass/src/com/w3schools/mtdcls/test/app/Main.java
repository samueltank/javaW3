package com.w3schools.mtdcls.test.app;

import com.w3schools.mtdcls.test.model.Car;
import com.w3schools.mtdcls.test.model.Method;

public class Main
{
    // diferença entre static e public: static pode ser acessado sem a instância de uma class; public só com instância;

    static void staticTeste()
    {
        System.out.println("Método static acessado!");
    }

    public void publicTeste()
    {
        System.out.println("Método public acessado!");
    }

    public static void main(String[] args) // método principal;
    {
        // chamada de um método static:

        staticTeste(); // chamada direta, pois não precisa de uma instância para ser chamado(static é usado na class que contém o método MAIN);

        // chamada de um método public:

        Main objeto = new Main();
        objeto.publicTeste(); // chamada possível apenas com a criação de um objeto e chamada ao método 'publicTest()';

        // *** chamada para o carro ***

        Car objCarro = new Car();
        objCarro.partir();
        objCarro.acelerar(300);
    }
}
