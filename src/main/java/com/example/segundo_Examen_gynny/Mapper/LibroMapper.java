package com.example.segundo_Examen_gynny.Mapper;

import org.mapstruct.Mapper;

import com.example.segundo_Examen_gynny.Dtos.LibroDTO;
import com.example.segundo_Examen_gynny.Persistence.entities.LibroEntity;

@Mapper(componentModel = "spring", uses = {AutorMapper.class})
public interface LibroMapper {
	
	LibroDTO toDto(LibroEntity libroEntity);
	LibroEntity toEntity(LibroDTO libroDTO);
	
	

	
}
