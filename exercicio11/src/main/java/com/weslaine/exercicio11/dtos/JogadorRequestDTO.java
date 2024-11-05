package com.weslaine.exercicio11.dtos;

import jakarta.validation.constraints.NotBlank;

public record JogadorRequestDTO(
    @NotBlank(message = "Campo nome não pode estar vazio")
    String nome, 
    @NotBlank(message = "Campo apelido não pode estar vazio")
    String apelido
) {
    
}
