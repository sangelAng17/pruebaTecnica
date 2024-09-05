package com.example.pruebat.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Entity
@Getter
@Setter
@Table(name = "ciudad")
@AllArgsConstructor
public class Ciudad  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id_ciudad")
    private Long idCiudad;

    @Column(name = "name_ciudad")
    public String ciudad;
    public Ciudad() {}
}
