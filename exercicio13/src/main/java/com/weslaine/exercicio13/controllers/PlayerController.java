package com.weslaine.exercicio13.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weslaine.exercicio13.dtos.PlayerRequestDto;
import com.weslaine.exercicio13.dtos.PlayerResponseDto;
import com.weslaine.exercicio13.services.PlayerService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/player")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @PostMapping
    public PlayerResponseDto createPlayer(@RequestBody @Valid PlayerRequestDto playerResquestDto){
        return playerService.createPlayer(playerResquestDto);
    }

    @GetMapping 
    public List<PlayerResponseDto> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @DeleteMapping("{nome}")
    public PlayerResponseDto deletePlayer(@PathVariable String nome){
        return playerService.deletePlayer(nome);
    }
}