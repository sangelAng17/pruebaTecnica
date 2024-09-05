package com.example.pruebat.persistence.repository;


import com.example.pruebat.persistence.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {
    Reserva findAllById(Long id);
}
