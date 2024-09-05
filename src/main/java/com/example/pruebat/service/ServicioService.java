package com.example.pruebat.service;

import com.example.pruebat.persistence.entity.Servicio;

import java.util.ArrayList;

public interface ServicioService {
    ArrayList<Servicio> findAll();
    Servicio findAllById(Long id);
    Servicio UpdateById(Servicio servicio);
    void deteteById(Long id);
    Servicio save(Servicio servicio);

}
