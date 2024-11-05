package com.weslaine.exercicio11.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.weslaine.exercicio11.dtos.JogadorRequestDTO;
import com.weslaine.exercicio11.dtos.JogadorResponseDTO;

@Service
public class JogadorService {
    ArrayList<JogadorResponseDTO> jogadores = new ArrayList<>();

    public JogadorResponseDTO create(JogadorRequestDTO jogadorRequestDTO) {
        Random random = new Random();
        int habilidade = random.nextInt(101);
        JogadorResponseDTO jogador = new JogadorResponseDTO(jogadorRequestDTO.nome(), jogadorRequestDTO.apelido(), habilidade);
        jogadores.add(jogador);
        return jogador;
    }
    
    public List<JogadorResponseDTO> getAll() {
        return jogadores;
    }

}
