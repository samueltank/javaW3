package com.w3schools.artlst.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main
{
    private static void pularLinha()
    {
        System.out.println();
    }

    public static void main(String[] args)
    {
        // matriz de objetos do tipo ArrayList<String>:
        ArrayList<String> cores = new ArrayList<String>(); // cria um objeto ArrayList do tipo String;
        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Cinza");
        cores.add("Roxo");
        System.out.println(cores);

        System.out.println(cores.get(0)); // retorna o valor contido no array de índice 0;
        System.out.println(cores.set(0, "Yellow")); // altera o valor do objeto matriz cores no índice 0;
        System.out.println(cores.get(0)); // retorna o valor alterado;

        pularLinha();

        ArrayList<Integer> pares = new ArrayList<Integer>();
        pares.add(4);
        pares.add(2);
        pares.add(8);
        pares.add(2);
        pares.add(0);
        pares.add(22);
        pares.add(18);

        for (int i : pares)
        {
            System.out.print(i + " ");
        }

        pularLinha();

        Collections.sort(pares); // organiza o conteúdo de uma lista de objetos(ArrayList);
        for (int i : pares)// imprime a matriz de objetos em ordem;
        {
            System.out.print(i + " ");
        }

        pularLinha();

        // matriz com chave/valor do tipo HashMap:
        HashMap<String, Integer> pessoas = new HashMap<String, Integer>();
        pessoas.put("Samuel", 20);
        pessoas.put("Gabriel", 15);
        pessoas.put("Ellen", 19);
        pessoas.put("Rebeca", 18);

        System.out.println(pessoas.keySet() + "" + pessoas.values()); // imprime as chaves da matriz e em seguida os valores de cada chave;
        System.out.println(pessoas.size()); // imprime o "tamanho" da "Matriz";

        pessoas.clear(); // limpa a "matriz";

        pessoas.put("Samuel", 20);

        System.out.println(pessoas.keySet() + "" + pessoas.values());
        System.out.println(pessoas.size());

        pessoas.remove("Samuel"); // remove uma chave e seu valor da "matriz";

        System.out.println(pessoas.keySet() + "" + pessoas.values());
        System.out.println(pessoas.size());

        pessoas.put("Gabriel", 15);
        pessoas.put("Geovanna", 23); // minha futura esposa... (hoje ela tem 17);

        pularLinha();

        // for-each de um HashMap:
        for (String i : pessoas.keySet())  // o método ketSet() retorna as chaves;
        {
            System.out.print(i + " ");
        }

        pularLinha();

        for (int i : pessoas.values()) // o método valoes() retorna os valores das chaves;
        {
            System.out.print(i + " ");
        }

        pularLinha();

        for (String i : pessoas.keySet()) // método pega uma chave e armazena em i, até terminar as chaves;
        {
            System.out.println("Key: " + i + ", valor: " + pessoas.get(i)); // pessoas.get(i) retorna o valor da chave i(atual);
        }
    }
}
