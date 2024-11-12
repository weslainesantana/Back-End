package com.weslaine.exercicio13.services;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.weslaine.exercicio13.dtos.PlayerRequestDto;
import com.weslaine.exercicio13.dtos.PlayerResponseDto;

import com.weslaine.exercicio13.mappers.PlayerMapper;
import com.weslaine.exercicio13.models.PlayerEntity;
import com.weslaine.exercicio13.repositories.PlayerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;
    
    public PlayerResponseDto createPlayer(PlayerRequestDto playerResquestDto){
        PlayerEntity playerEntity = playerMapper.toEntity(playerResquestDto);
        Optional<PlayerEntity> player = playerRepository.findById(playerResquestDto.nome());
        if(player.isPresent()) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Nome já cadastrado");
        Random random = new Random();
        playerEntity.setHabilidade(random.nextInt(101));
        return playerMapper.toDto(playerRepository.save(playerEntity));
    }

    public List<PlayerResponseDto> getAllPlayers(){
        return playerRepository.findAll().stream().map(playerMapper::toDto).toList();
    }

    public PlayerResponseDto deletePlayer(String nome){
        Optional<PlayerEntity> player = playerRepository.findById(nome); 
        if(player.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Jogador não encontrado");

        playerRepository.delete(player.get());
        return playerMapper.toDto(player.get());
    }
}
