package com.example.pruebat.service.impl;


import com.example.pruebat.persistence.entity.Reserva;
import com.example.pruebat.persistence.entity.Servicio;
import com.example.pruebat.persistence.repository.ReservaRepository;
import com.example.pruebat.persistence.repository.ServicioRepository;
import com.example.pruebat.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ServicioRepository servicioRepository;


    @Override
    public ArrayList<Reserva> findAll(){
        return (ArrayList<Reserva>) reservaRepository.findAll();
    }

    @Override
    public Reserva findAllById(Long id){
        return reservaRepository.findAllById(id);
    }

    @Override
    public Reserva UpdateById(Reserva reserva){
        try{
            reservaRepository.save(reserva);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return reservaRepository.findAllById(reserva.getId());
    }

    @Override
    public void deteteById(Long id){
        try{
            Reserva reserva =reservaRepository.findAllById(id);
            Servicio servicio= servicioRepository.findAllByIdServicio(reserva.servicio.getIdServicio());
            servicio.setCheckblock(Boolean.FALSE);
            servicioRepository.save(servicio);

            reservaRepository.deleteById(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Reserva save(Reserva reserva){
        try{
            Servicio servicio= servicioRepository.findAllByIdServicio(reserva.servicio.getIdServicio());
            servicio.setCheckblock(Boolean.TRUE);
            servicioRepository.save(servicio);

            reservaRepository.save(reserva);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return reserva;
    }
}
