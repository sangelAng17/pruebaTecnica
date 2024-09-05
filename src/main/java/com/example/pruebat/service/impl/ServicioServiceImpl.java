package com.example.pruebat.service.impl;

import com.example.pruebat.persistence.entity.Servicio;
import com.example.pruebat.persistence.repository.ServicioRepository;
import com.example.pruebat.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public ArrayList<Servicio> findAll(){
        return (ArrayList<Servicio>) servicioRepository.findAll();
    }

    @Override
    public Servicio findAllById(Long id){
        return servicioRepository.findAllByIdServicio(id);
    }

    @Override
    public Servicio UpdateById(Servicio servicio){
        try{
            servicioRepository.save(servicio);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return servicioRepository.findAllByIdServicio(servicio.getIdServicio());
    }


    @Override
    public void deteteById(Long id){
        try{
            servicioRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Servicio save(Servicio servicio){
        try{
            servicioRepository.save(servicio);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return servicio;
    }
}
