package com.weslaine.exercicio07.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//annotecion
@RestController
public class RecomendacaoController {
    @GetMapping("/recomendar")
    public String recomendar(@RequestParam String genero, @RequestParam String ambiente){
        if(genero.equals("acao") && ambiente.equals("futurista")) {
            return "Homens de Preto";
        } else if(genero.equals("acao") && ambiente.equals("medieval")) {
            return "Como treinar seu dragão";
        } else if(genero.equals("romance") && ambiente.equals("moderno")) {
            return "UPGRADE";
        } else if(genero.equals("comedia-romantica") && ambiente.equals("futurista")) {
            return "Todos menos você";
        }
        return "Nenhum filme com esses atributos";
    }
}
