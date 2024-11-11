package com.weslaine.exercicio12.dtos;

public record TransacaoResponseDTO(
    ContaDto origem, 
    ContaDto destino, 
    Double valor

) {
    
}
