package com.example.segundo_Examen_gynny.Mapper;

import org.mapstruct.Mapper;

import com.example.segundo_Examen_gynny.Dtos.AutorDTO;
import com.example.segundo_Examen_gynny.Persistence.entities.AutorEntity;


@Mapper
public interface AutorMapper {
	
	AutorDTO toDto(AutorEntity autorEntity);
	AutorEntity toEntity(AutorDTO autorDTO);
}
