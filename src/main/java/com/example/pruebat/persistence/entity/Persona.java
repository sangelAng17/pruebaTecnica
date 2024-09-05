package com.example.pruebat.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Builder
@Entity
@Getter
@Setter
@Table(name = "persona")
@AllArgsConstructor
public class Persona {

    @Id
    @JoinColumn(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(name = "nombres")
    public String nombres;
    @Column(name = "apellidos")
    public String apellidos;
    @Column(name = "documento")
    public String documento;
    public Persona() {}
}
