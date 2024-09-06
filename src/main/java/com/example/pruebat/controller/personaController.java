package com.example.pruebat.controller;


import com.example.pruebat.persistence.entity.Persona;
import com.example.pruebat.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/person")
public class personaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public ResponseEntity<ArrayList<Persona>> findAll(){
        try{
            return ResponseEntity.ok(personaService.findAll());
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Persona> findAllById(@PathVariable Long id){
        try{
            return ResponseEntity.ok(personaService.findAllById(id));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Persona> findAllById(@RequestBody Persona persona){
        try{
            return ResponseEntity.ok(personaService.UpdateById(persona));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        try{
            personaService.deteteById(id);
            return ResponseEntity.ok("");
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/insert")
    public ResponseEntity<Persona> insert(@RequestBody Persona persona){
        try{
            return ResponseEntity.ok(personaService.save(persona));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }

}
