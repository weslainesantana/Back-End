package com.weslaine.exercicio08.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.weslaine.exercicio08.dtos.CarroDto;
import com.weslaine.exercicio08.dtos.FipeResponse;

@RestController 
public class FipeController {
    @PostMapping("/")
    public FipeResponse searchFipe(@RequestBody CarroDto carroDto){
        if (
            carroDto.marca().equals("Fiat")&&
            carroDto.modelo().equals("Uno")&&
            carroDto.ano() == 2023){
        return new FipeResponse("50000.0", "Setembro de 2024");

        }
        return new FipeResponse("Não encontrado", "Ano ou modelo inválido");
    }
}
