package com.example.segundo_Examen_gynny.Controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.segundo_Examen_gynny.Dtos.LibroDTO;
import com.example.segundo_Examen_gynny.Services.AutorServices;

@RestController
@RequestMapping("/libros")

public class LibroRestController {


	@Autowired
	AutorServices libroServices;
	
	@PostMapping
	ResponseEntity<?> createLibro(@RequestBody LibroDTO libroDTO){
		
		LibroDTO libro= libroServices.createLibro(libroDTO);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/" + libro.getId())
			.buildAndExpand(libro.getAutorId()).toUri();
		return ResponseEntity.created(location).build();
		
	}
}
