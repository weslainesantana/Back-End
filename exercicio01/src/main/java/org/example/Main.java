package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Que ambientacao voce prefere");
        System.out.println("1 - sci fi");
        System.out.println("2 - medieval");
        Integer opcaoAmbientacao = leitor.nextInt();

        System.out.println("Que genero voce prefere");
        System.out.println("1 - comedia");
        System.out.println("2 - drama");
        Integer opcaoGenero = leitor.nextInt();


        if (opcaoAmbientacao == 1 && opcaoGenero == 1)
            System.out.println("Homens de Preto");
        if (opcaoAmbientacao == 1 && opcaoGenero == 2)
            System.out.println("Arrival");
        if (opcaoAmbientacao == 2 && opcaoGenero == 1)
            System.out.println("Shrek");
        if (opcaoAmbientacao == 2 && opcaoGenero == 2)
            System.out.println("Gladiador");
        

    }
}