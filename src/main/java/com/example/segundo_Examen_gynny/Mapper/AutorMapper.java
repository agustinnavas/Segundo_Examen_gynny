package com.example.segundo_Examen_gynny.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.segundo_Examen_gynny.Dtos.AutorDTO;
import com.example.segundo_Examen_gynny.Persistence.entities.AutorEntity;


@Mapper(componentModel = "spring", uses = {LibroMapper.class})
public interface AutorMapper {
	
	AutorDTO toDto(AutorEntity autorEntity);
	AutorEntity toEntity(AutorDTO autorDTO);
	
	@Mapping(target="libro", ignore=true)
	AutorDTO toDtoWithoutLibros(AutorEntity autor);
	
	
}
