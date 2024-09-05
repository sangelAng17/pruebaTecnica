package com.example.pruebat.controller;


import com.example.pruebat.persistence.entity.Servicio;
import com.example.pruebat.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/servicio")
public class servicioController {

    @Autowired
    private ServicioService servicioService;

    @GetMapping("/")
    public ResponseEntity<ArrayList<Servicio>> findAll(){
        try{
            return ResponseEntity.ok(servicioService.findAll());
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Servicio> findAllById(@PathVariable Long id){
        try{
            return ResponseEntity.ok(servicioService.findAllById(id));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Servicio> findAllById(@RequestBody Servicio servicio){
        try{
            return ResponseEntity.ok(servicioService.UpdateById(servicio));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        try{
            servicioService.deteteById(id);
            return ResponseEntity.ok("");
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/insert")
    public ResponseEntity<Servicio> insert(@RequestBody Servicio servicio){
        try{
            return ResponseEntity.ok(servicioService.save(servicio));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }


}
