package com.weslaine;

public class Personagem {
    String nome; 
    int vida; 
    int ataque;

    public void receberDano(int dano, Personagem alvo) {
        this.vida -= dano;
        if(vida <= 0) {
            System.out.println(alvo.nome+ " foi derrotado");
        } 
    }
    public void atacar(Personagem alvo, int ataque) {
        
        if (alvo.vida > 0) {
            receberDano(ataque, alvo);
            alvo.vida = vida-ataque;
        } else {

            System.out.println("ataque falhou");
        }
    }
    
}
