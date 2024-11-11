package com.weslaine.exercicio12.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weslaine.exercicio12.dtos.TransacaoRequestDTO;
import com.weslaine.exercicio12.dtos.TransacaoResponseDTO;
import com.weslaine.exercicio12.services.TransacoesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transacao")
public class TransacaoController {
    private final TransacoesService transacoesService;

    @PostMapping
    public TransacaoResponseDTO gerarTransacao(@RequestBody TransacaoRequestDTO transacaoRequestDTO){
        return transacoesService.gerarTransacao(transacaoRequestDTO);
    }
}