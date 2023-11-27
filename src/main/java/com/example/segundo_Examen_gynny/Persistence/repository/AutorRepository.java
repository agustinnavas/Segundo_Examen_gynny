package com.example.segundo_Examen_gynny.Persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.segundo_Examen_gynny.Persistence.entities.AutorEntity;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity, Long> {

}
