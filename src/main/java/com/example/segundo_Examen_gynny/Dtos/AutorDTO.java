package com.example.segundo_Examen_gynny.Dtos;

import java.util.ArrayList;
import java.util.List;

public class AutorDTO {
	
	private Long id;
    private String nombre;
    private String nacionalidad;
    private List<LibroDTO> libros = new ArrayList<>();
	
    
    public AutorDTO(Long id, String nombre, String nacionalidad, List<LibroDTO> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.libros = libros;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public List<LibroDTO> getLibros() {
		return libros;
	}


	public void setLibros(List<LibroDTO> libros) {
		this.libros = libros;
	}


	@Override
	public String toString() {
		return "AutorDTO [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", libros=" + libros
				+ "]";
	}
    
    

  
}
