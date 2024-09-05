package com.example.pruebat.persistence.repository;

import com.example.pruebat.persistence.entity.Servicio;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ServicioRepository extends JpaRepository<Servicio,Long> {

    Servicio findAllByIdServicio(Long id);

    @Modifying
    @Transactional
    @Query("UPDATE Servicio set checkblock = :status where idServicio = :id ")
    Servicio updateCheckById(@Param("status") Boolean status, @Param("id") Long id);

}
