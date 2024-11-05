package com.weslaine.exercicio11.controllers;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weslaine.exercicio11.dtos.JogadorRequestDTO;
import com.weslaine.exercicio11.dtos.JogadorResponseDTO;
import com.weslaine.exercicio11.services.JogadorService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("jogador")
public class JogadorController {
    private final JogadorService jogadorService;

    @PostMapping
    public JogadorResponseDTO create(@RequestBody @Valid JogadorRequestDTO jogadorRequestDTO) {
        return jogadorService.create(jogadorRequestDTO);
    }

    @GetMapping
    public List<JogadorResponseDTO> getAll() {
        return jogadorService.getAll();
    }
}
