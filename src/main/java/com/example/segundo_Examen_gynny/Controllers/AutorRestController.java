package com.example.segundo_Examen_gynny.Controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.segundo_Examen_gynny.Dtos.AutorDTO;
import com.example.segundo_Examen_gynny.Services.AutorServices;

@RestController
@RequestMapping("/autores")

public class AutorRestController {
	
	@Autowired
	AutorServices autorService;
	
	@PostMapping
	ResponseEntity<?> createAutor(@RequestBody AutorDTO autorDTO){
		
		AutorDTO autor= autorService.createAutor(autorDTO);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/" + autor.getId())
			.buildAndExpand(autor.getLibros()).toUri();
		return ResponseEntity.created(location).build();
		
	}

}
