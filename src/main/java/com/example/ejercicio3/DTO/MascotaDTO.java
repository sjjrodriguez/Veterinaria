package com.example.ejercicio3.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MascotaDTO {
    private String nombre;
    private String raza;
    private int edad;
    // el id no se recibe desde el cliente, lo genera la BD
}