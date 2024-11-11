package com.weslaine.exercicio12.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransacaoEntity {
    private String origem;
    private String destino;
    private Double valor;
}
