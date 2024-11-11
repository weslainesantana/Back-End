package com.weslaine.exercicio12.mappers;

import org.mapstruct.Mapper;

import com.weslaine.exercicio12.dtos.ContaDto;
import com.weslaine.exercicio12.models.ContaEntity;

@Mapper(componentModel = "spring")
public interface ContaMapper {
    ContaDto toDto(ContaEntity contaEntity);
    
}
