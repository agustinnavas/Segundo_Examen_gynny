package com.example.segundo_Examen_gynny.Mapper;

import org.mapstruct.Mapper;

import com.example.segundo_Examen_gynny.Dtos.LibroDTO;
import com.example.segundo_Examen_gynny.Persistence.entities.LibroEntity;

@Mapper
public interface LibroMapper {
	
	LibroDTO toDto(LibroEntity libro);
	LibroEntity toEntity(LibroDTO libroDTO);
	
	

	
}
