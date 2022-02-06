package com.youtube.brocode.guib.test;

import javax.swing.*; // importa todas as classes do pacote javax.swing;

public class Main
{
    public static void main(String[] args)
    {
        // GUI simples com a classe
        String name = JOptionPane.showInputDialog("Qual o seu nome?");
        JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
        JOptionPane.showMessageDialog(null, "Você tem " + age + " anos de idade!");

        double heigth = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura?"));
        JOptionPane.showMessageDialog(null, "Você tem " + heigth + " cm de altura!");
    }
}
