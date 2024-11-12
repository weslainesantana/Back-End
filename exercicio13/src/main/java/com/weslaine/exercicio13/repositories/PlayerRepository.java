package com.weslaine.exercicio13.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslaine.exercicio13.models.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, String>{
    
}
