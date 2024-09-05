package com.example.pruebat.persistence.repository;


import com.example.pruebat.persistence.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
    Persona findAllByIdUsuario(Long id);
}
