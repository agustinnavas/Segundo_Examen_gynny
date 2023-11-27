package com.example.segundo_Examen_gynny.Persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class AutorEntity {
	
	//atributos
	private Long id;
	private String nombre;
	@OneToMany(mappedBy ="autor")
	private String nacionalidad;
	
	//Constructor
	public AutorEntity(Long id, String nombre, String nacionalidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}
	
	//Getter y setter
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
	//to string

	@Override
	public String toString() {
		return "AutorEntity [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
	
	


}
