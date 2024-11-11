package com.weslaine.exercicio12.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.weslaine.exercicio12.dtos.ContaDto;
import com.weslaine.exercicio12.dtos.TransacaoRequestDTO;
import com.weslaine.exercicio12.dtos.TransacaoResponseDTO;
import com.weslaine.exercicio12.mappers.ContaMapper;
import com.weslaine.exercicio12.models.ContaEntity;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransacoesService {
    private final ContaMapper contaMapper;
    ArrayList<ContaEntity> contas = new ArrayList<>();

    @PostConstruct
    public void criarUsuariosIniciais(){
        ContaEntity conta1 = new ContaEntity("500-1", "Fulano");
        ContaEntity conta2 = new ContaEntity("320-2","Ciclano");
        contas.add(conta1);
        contas.add(conta2);
    }
    public TransacaoResponseDTO gerarTransacao(TransacaoRequestDTO transacaoRequestDTO){
        Optional<ContaEntity> contaOrigem = contas.stream().filter(conta -> conta.getCodigo().equals(transacaoRequestDTO.origem())).findFirst();
        Optional<ContaEntity> contaDestino = contas.stream().filter(conta -> conta.getCodigo().equals(transacaoRequestDTO.destino())).findFirst();
        if(contaOrigem.isEmpty() || contaDestino.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "conta de origem ou conta de destino não foi encontrada");
        ContaDto origem = contaMapper.toDto(contaOrigem.get());
        ContaDto destino = contaMapper.toDto(contaDestino.get());
        return new TransacaoResponseDTO(origem, destino, transacaoRequestDTO.valor());
    }
}
