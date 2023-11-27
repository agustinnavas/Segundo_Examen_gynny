package com.example.segundo_Examen_gynny.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.segundo_Examen_gynny.Dtos.LibroDTO;
import com.example.segundo_Examen_gynny.Mapper.LibroMapper;
import com.example.segundo_Examen_gynny.Persistence.repository.LibroRepository;


public class LibroServicesImpl implements LibroServices{
	
	@Autowired
	public LibroRepository libroRepository;
	@Autowired
	public LibroMapper libroMapper;

	@Override
	public LibroDTO createLibro(LibroDTO libroDTO) {
		
		return libroMapper.toDto(libroRepository.save(libroMapper.toEntity(libroDTO)));
	}

}
