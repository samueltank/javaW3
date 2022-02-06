package com.w3schools.file;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criação de arquivo:
        try { // O try-catch serve para tratar um erro, caso ele apareça.
            File myFile = new File("arqTest.txt"); // Criação do obj.
            if (myFile.createNewFile()) { // Criação do arquivo(arqTest.txt).
                System.out.printf("Arquivo %s criado com sucesso! \n",
                        myFile.getName());
                System.out.println("Diretório: " + myFile.getAbsolutePath());
            } else {
                System.out.println("O arquivo já existe!");
                System.out.println("Diretório: " + myFile.getAbsolutePath());
            }

            // Exclusão do arquivo criado:
            if (myFile.delete()) {
                System.out.println("O arquivo %s foi deletado!" +
                        myFile.getName());
            } else {
                System.out.println("O arquivo não foi deletado!");
            }
        } catch (IOException e) {
            System.out.println("Um erro ocorre na criação do arquivo!");
            e.printStackTrace();
        }
        /*
        * finally {}: O bloco é executado independentemente dos blocos
        * anteriores.
        */

        // Gravação em arquivo:
        try {
            File myFile = new File("Gravar.txt");
            FileWriter fileWriter = new FileWriter(myFile);
            fileWriter.write("Hello World!");
            fileWriter.close();
            System.out.println("Arquivo criado e escrito com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na criação e gravação do " +
                    "arquivo!");
            e.printStackTrace();
        }

        // Ler um arquivo:
        try {
            File myFile = new File("Arquivo leitura");
            if (myFile.createNewFile()) {
                System.out.println("Arquivo criado!");
            } else {
                System.out.println("Arquivo existente!");
            }

            FileWriter fileWriter = new FileWriter(myFile);
            fileWriter.write("Aqui está escrito que Deus é o começo e o fim! " +
                            "\n");
            fileWriter.write("Aquele que crer em Jesus, o Cristo, não " +
                    "perecerá, mas terá a vida eterna...\n");
            fileWriter.close();

            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNext()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("O arquivo não foi lido!");
            e.printStackTrace();
        }
    }
}
