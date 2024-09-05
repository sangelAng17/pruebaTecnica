package com.example.pruebat.persistence.repository;


import com.example.pruebat.persistence.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad,Long> {

    Ciudad findAllByIdCiudad (Long id);


}
