package com.weslaine.exercicio13.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.weslaine.exercicio13.dtos.PlayerResponseDto;
import com.weslaine.exercicio13.dtos.PlayerRequestDto;
import com.weslaine.exercicio13.models.PlayerEntity;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    PlayerResponseDto toDto(PlayerEntity playerEntity);
    @Mapping(target = "habilidade", ignore = true)
    PlayerEntity toEntity(PlayerRequestDto playerResquestDto);
}
