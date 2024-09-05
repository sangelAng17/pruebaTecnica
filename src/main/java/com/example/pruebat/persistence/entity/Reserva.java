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
@Table(name = "reserva")
@AllArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Long id;
    @Column(name = "fecha_ingreso")
    public String fechaIngreso;
    @Column(name = "fecha_salida")
    public String fechaSalida;
    @Column(name = "cant_personas")
    public String cantPersonas;
    @OneToOne
    @JoinColumn(name = "id_ciudad")
    public Ciudad ciudad;
    @OneToOne
    @JoinColumn(name = "id_usuario")
    public Persona persona;
    @OneToOne
    @JoinColumn(name = "id_servicio")
    public Servicio servicio;
    public Reserva() {}
}
