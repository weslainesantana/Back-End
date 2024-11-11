package com.weslaine.exercicio12.dtos;

public record TransacaoRequestDTO(
    String origem, 
    String destino, 
    double valor

) {
    
}
