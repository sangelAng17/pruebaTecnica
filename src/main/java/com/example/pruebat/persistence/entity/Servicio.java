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
@Table(name = "servicio")
@AllArgsConstructor
public class Servicio {

    @Id
    @JoinColumn(name = "id_servicio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServicio;
    @Column(name = "tipo_habitacion")
    public String tipoHabitacion;
    @Column(name = "precio")
    public String precio;
    @Column(name = "opciones")
    public String opciones;
    @Column(name = "contenido")
    public String contenido;
    @Column(name = "camas")
    public String camas;
    @Column(name = "checkblock")
    public Boolean checkblock;

    public Servicio() {

    }
}
