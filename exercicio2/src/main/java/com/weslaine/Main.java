package com.weslaine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Personagem orc = new Personagem();
        orc.nome = "Orc";
        orc.vida = 100;
        orc.ataque = 10;
    
        Personagem goblin = new Personagem();
        goblin.nome = "Goblin";
        goblin.vida = 50;
        goblin.ataque = 5; 

        Personagem lobo = new Personagem();
        lobo.nome = "Lobo";
        lobo.vida = 75;
        lobo.ataque = 15;

        Personagem cavalheiro = new Personagem();
        cavalheiro.nome = "Cavaleiro";
        cavalheiro.vida = 200;
        cavalheiro.ataque = 20;

        Personagem dragao = new Personagem();
        dragao.nome = "Dragão";
        dragao.vida = 500;
        dragao.ataque = 50;

        Personagem steve = new Personagem();
        steve.nome = "Steve";
        steve.vida = 100;
        steve.ataque = 20;

        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(orc);
        inimigos.add(goblin);
        inimigos.add(lobo);

        Random random = new Random();

        while (steve.vida > 0 && !inimigos.isEmpty()) {
            Personagem inimigoAleatorio = inimigos.get(random.nextInt(inimigos.size()));
            steve.atacar(inimigoAleatorio, 20);

            inimigos.removeIf(inimigo -> inimigo.vida <= 0);

            if (inimigos.isEmpty()) {
                break;
            }

            for (Personagem inimigo : inimigos) {
                inimigo.atacar(steve,10);
                if (steve.vida <= 0) {
                    System.out.println("O jogador foi derrotado. Fim de jogo!");
                    break;
                }
            }
        }
    }
}