package com.example.ejercicio3.Repository;

import com.example.ejercicio3.Model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
    // JpaRepository ya trae: findAll, findById, save, deleteById, etc.
}