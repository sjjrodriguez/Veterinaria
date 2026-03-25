package com.example.ejercicio3.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mascotas")
@Data                   // getters, setters, toString, equals, hashCode
@NoArgsConstructor      // constructor vacío
@AllArgsConstructor     // constructor con todos los campos
@Builder                // patrón builder (opcional pero útil)
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 80)
    private String nombre;

    @Column(nullable = false, length = 80)
    private String raza;

    @Column(nullable = false)
    private int edad;
}