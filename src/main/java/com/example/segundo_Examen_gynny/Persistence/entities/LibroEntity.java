package com.example.segundo_Examen_gynny.Persistence.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class LibroEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)


    private Long id;
    private String titulo;
    private String isbn;
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private AutorEntity autor;


    
    public LibroEntity(Long id, String titulo, String isbn, BigDecimal precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.isbn = isbn;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "LibroEntity [id=" + id + ", titulo=" + titulo + ", isbn=" + isbn + ", precio=" + precio + "]";
	}

    
}
