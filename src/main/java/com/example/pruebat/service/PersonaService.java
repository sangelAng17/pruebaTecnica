package com.example.pruebat.service;

import com.example.pruebat.persistence.entity.Persona;

import java.util.ArrayList;

public interface PersonaService {
    ArrayList<Persona> findAll();
    Persona findAllById(Long id);
    Persona UpdateById(Persona persona);
    void deteteById(Long id);
    Persona save(Persona persona);
}
