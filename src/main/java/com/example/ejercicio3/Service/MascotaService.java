
package com.example.ejercicio3.Service;

import com.example.ejercicio3.DTO.MascotaDTO;
import com.example.ejercicio3.Model.Mascota;

import java.util.List;

public interface MascotaService {

    List<Mascota> listarTodas();

    Mascota buscarPorId(Long id);

    Mascota crear(MascotaDTO dto);

    Mascota actualizar(Long id, MascotaDTO dto);

    void eliminar(Long id);
}