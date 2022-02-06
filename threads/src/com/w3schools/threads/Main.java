/*
* Este projeto possui intuito didático sobre Threads.
*
* @date 12/22/2021
* @author Samuel Tank
*/

package com.w3schools.threads;

/**
* Um {@code Thread} faz com que o programa rode de maneira mais eficiente, pois
* executa um ou mais blocos de código em segundo plano.
*/

public class Main {
    /**
    * Um dos métodos para criar um {@code Thread} é implementar a interface
    * {@code Runnable},
    * desenvolver o conteúdo do bloco de código que era {@code abstract} e esse
    * bloco é executado pelo {@code Thread}.
    *
    */


    protected static class Threadtest implements Runnable {
        @Override public void run() {
            System.out.println("Este código foi executado em um thread!");
        }
    }

    public static void main(String[] args) {
        Threadtest threadTest = new Threadtest();
        Thread thread = new Thread(threadTest);
        thread.start();
    }

    /*
     * Método de criação de Threads com mais liberdade, pois ainda é possível
     * implementar mais interfaces. Ainda é possível usar herança para herdar uma
     * classe responsável pelo Thread e sobrescrever o método run(), esse bloco
     * será executado em segundo plano. Para executar o Thread use o método
     * start(), assim como no método por implementação.
     *
     * Neste caso, o Thread foi criado por implementação
     */
}
