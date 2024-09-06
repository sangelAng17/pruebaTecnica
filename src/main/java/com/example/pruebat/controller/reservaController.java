package com.example.pruebat.controller;


import com.example.pruebat.persistence.entity.Reserva;
import com.example.pruebat.service.ReservaService;
import com.example.pruebat.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/reserva")
public class reservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping("/")
    public ResponseEntity<ArrayList<Reserva>> findAll(){
        try{
            return ResponseEntity.ok(reservaService.findAll());
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Reserva> findAllById(@PathVariable Long id){
        try{
            return ResponseEntity.ok(reservaService.findAllById(id));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Reserva> findAllById(@RequestBody Reserva reserva){
        try{
            return ResponseEntity.ok(reservaService.UpdateById(reserva));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        try{
            reservaService.deteteById(id);
            return ResponseEntity.ok("");
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/insert")
    public ResponseEntity<Reserva> insert(@RequestBody Reserva reserva){
        try{
            return ResponseEntity.ok(reservaService.save(reserva));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }
}
