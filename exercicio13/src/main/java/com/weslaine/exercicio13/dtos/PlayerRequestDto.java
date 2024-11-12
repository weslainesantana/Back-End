package com.weslaine.exercicio13.dtos;

import jakarta.validation.constraints.NotBlank;

public record PlayerRequestDto(
    @NotBlank(message = "Nome não pode estar em branco")
    String nome, 
    @NotBlank(message = "Apelido não pode estar em branco")
    String apelido
) {
    
}
