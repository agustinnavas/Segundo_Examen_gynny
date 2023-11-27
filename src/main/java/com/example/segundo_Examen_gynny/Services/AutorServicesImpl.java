package com.example.segundo_Examen_gynny.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.segundo_Examen_gynny.Dtos.AutorDTO;
import com.example.segundo_Examen_gynny.Mapper.AutorMapper;
import com.example.segundo_Examen_gynny.Persistence.repository.AutorRepository;

@Service
public class AutorServicesImpl implements AutorServices {

	@Autowired
	public AutorRepository autorRepository;
	@Autowired
	public AutorMapper autorMapper;
	
	
	@Override
	public AutorDTO createAutor(AutorDTO autorDTO) {
		
		return autorMapper.toDto(autorRepository.save(autorMapper.toEntity(autorDTO)));
	}

	@Override
	public AutorDTO listaAutores() {
		
		return null;
	}

}
