package com.example.pruebat.service;


import com.example.pruebat.persistence.entity.Ciudad;

import java.util.ArrayList;

public interface CiudadService {
    ArrayList<Ciudad> findAll();
    Ciudad findAllById(Long id);
    Ciudad UpdateById(Ciudad ciudad);
    void deteteById(Long id);
    Ciudad save(Ciudad ciudad);
}
