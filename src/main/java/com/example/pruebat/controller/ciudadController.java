package com.example.pruebat.controller;


import com.example.pruebat.persistence.entity.Ciudad;
import com.example.pruebat.persistence.entity.Persona;
import com.example.pruebat.service.CiudadService;
import com.example.pruebat.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/ciudad")
public class ciudadController {

    @Autowired
    private CiudadService ciudadService;

    @GetMapping("/")
    public ResponseEntity<ArrayList<Ciudad>> findAll(){
        try{
            return ResponseEntity.ok(ciudadService.findAll());
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Ciudad> findAllById(@PathVariable Long id){
        try{
            return ResponseEntity.ok(ciudadService.findAllById(id));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Ciudad> findAllById(@RequestBody Ciudad ciudad){
        try{
            return ResponseEntity.ok(ciudadService.UpdateById(ciudad));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        try{
            ciudadService.deteteById(id);
            return ResponseEntity.ok("");
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/insert")
    public ResponseEntity<Ciudad> insert(@RequestBody Ciudad ciudad){
        try{
            return ResponseEntity.ok(ciudadService.save(ciudad));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }
}
