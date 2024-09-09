package com.weslaine;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis = new ArrayList<>();
    private List<Ingresso> ingressosVendidos = new ArrayList<>();
    private List<String> assentosDisponiveis = new ArrayList<>();

    public Cinema() {
        for (char fila = 'A'; fila <= 'F'; fila++) {
            for (int numero = 1; numero <= 5; numero++) {
                assentosDisponiveis.add(fila + Integer.toString(numero));
            }
        }
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme encontrarFilme(String nome) {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;
    }

    public void venderIngresso(Ingresso ingresso) throws Exception {
        if (!assentosDisponiveis.contains(ingresso.getAssento())) {
            throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
        }

        if (ingresso.getCliente().getIdade() < ingresso.getFilme().getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }

        assentosDisponiveis.remove(ingresso.getAssento());

        ingressosVendidos.add(ingresso);

        System.out.println("Ingresso vendido com sucesso! " + ingresso.getFilme().getNome() +
                " - " + ingresso.getAssento() + " - " + ingresso.getCliente().getNome());
    }
}