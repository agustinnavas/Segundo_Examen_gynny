package com.example.segundo_Examen_gynny.Persistence.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class AutorEntity {
	
	//atributos
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)


    private Long id;
    private String nombre;
    private String nacionalidad;

    @OneToMany(mappedBy = "autor")
    private List<LibroEntity> libros = new ArrayList<>();

	
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
