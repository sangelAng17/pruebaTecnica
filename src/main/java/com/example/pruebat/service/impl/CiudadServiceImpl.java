package com.example.pruebat.service.impl;


import com.example.pruebat.persistence.entity.Ciudad;
import com.example.pruebat.persistence.repository.CiudadRepository;
import com.example.pruebat.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CiudadServiceImpl implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;


    @Override
    public ArrayList<Ciudad> findAll(){
        return (ArrayList<Ciudad>) ciudadRepository.findAll();
    }

    @Override
    public Ciudad findAllById(Long id){
        return ciudadRepository.findAllByIdCiudad(id);
    }

    @Override
    public Ciudad UpdateById(Ciudad ciudad){
        try{
            ciudadRepository.save(ciudad);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ciudadRepository.findAllByIdCiudad(ciudad.getIdCiudad());
    }
    @Override
    public void deteteById(Long id){
        try{
            ciudadRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public Ciudad save(Ciudad ciudad) {
        try{
            ciudadRepository.save(ciudad);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ciudad;
    }
}
