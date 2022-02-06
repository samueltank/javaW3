package com.w3schools.thprob;

public class Main implements Runnable {
    protected static int amount = 0;

    /*
    * Isso gera um problema de simultaneidade, pois o thread pode ser iniciado
    * antes ou depois do contador "prioritário", alterando o valor, caso venha
    * antes. Gerando um valor imprevisível.
    *
    * Para resolver esse problema é preciso usar um método que verifique a
    * situação atual do thread e pare o programa até que o mesmo tenha
    * executado sua função. Esse método é o isAlive(), pertencente ao
    * thread.
    */

    public static void main(String[] args) {
        Main main = new Main();
        Thread thread = new Thread(main);
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Aguardando execução do thread...");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    @Override
    public void run() {
        amount++;
    }
}
