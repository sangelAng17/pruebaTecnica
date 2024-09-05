package com.example.pruebat.service.impl;


import com.example.pruebat.persistence.entity.Persona;
import com.example.pruebat.persistence.repository.PersonaRepository;
import com.example.pruebat.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public ArrayList<Persona> findAll(){
        return (ArrayList<Persona>) personaRepository.findAll();
    }
    @Override
    public Persona findAllById(Long id){
        return personaRepository.findAllByIdUsuario(id);
    }
    @Override
    public Persona UpdateById(Persona persona){
        try{
            personaRepository.save(persona);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return personaRepository.findAllByIdUsuario(persona.getIdUsuario());
    }
    @Override
    public void deteteById(Long id){
        try{
            personaRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public Persona save(Persona persona){
        try{
            personaRepository.save(persona);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return personaRepository.findAllByIdUsuario(persona.getIdUsuario());
    }
}
