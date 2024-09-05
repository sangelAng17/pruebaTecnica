package com.example.pruebat.service;


import com.example.pruebat.persistence.entity.Reserva;
import java.util.ArrayList;

public interface ReservaService {

    ArrayList<Reserva> findAll();
    Reserva findAllById(Long id);
    abstract Reserva UpdateById(Reserva reserva);
    void deteteById(Long id);
    Reserva save(Reserva reserva);
}
