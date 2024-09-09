package com.weslaine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        cinema.adicionarFilme(new Filme("Homem Aranha", 17.0, 16));
        cinema.adicionarFilme(new Filme("Um amor para recordar", 15.0, 12));
        cinema.adicionarFilme(new Filme("Como eu era antes de você", 20.0, 16));
        cinema.adicionarFilme(new Filme("Vingadores", 25.0, 10));
        cinema.adicionarFilme(new Filme("UPGRADE", 18.0, 14));
        cinema.adicionarFilme(new Filme("O Diabo veste prada", 22.0, 10));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Qual o seu nome? ");
                String nomeCliente = scanner.nextLine();

                System.out.print("Qual a sua idade? ");
                int idadeCliente = scanner.nextInt();
                scanner.nextLine(); 

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                System.out.print("Que filme você deseja assistir? ");
                String nomeFilme = scanner.nextLine();

                Filme filmeEscolhido = cinema.encontrarFilme(nomeFilme);
                if (filmeEscolhido == null) {
                    System.out.println("Filme não encontrado.");
                    continue;
                }

                System.out.println("Qual assento você deseja? (de A1 a F5)");
                String assento = scanner.nextLine();

                Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assento);
                cinema.venderIngresso(ingresso);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja comprar outro ingresso? (sim/não)");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("sim")) {
                break;
            }
        }

        scanner.close();
    }
}