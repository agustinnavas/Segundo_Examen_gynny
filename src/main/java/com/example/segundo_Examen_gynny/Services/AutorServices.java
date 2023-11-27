package com.example.segundo_Examen_gynny.Services;

import com.example.segundo_Examen_gynny.Dtos.AutorDTO;
import com.example.segundo_Examen_gynny.Dtos.LibroDTO;

public interface AutorServices {
	
	AutorDTO createAutor(AutorDTO autorDTO);

	AutorDTO listaAutores();

	LibroDTO createLibro(LibroDTO libroDTO);

}
