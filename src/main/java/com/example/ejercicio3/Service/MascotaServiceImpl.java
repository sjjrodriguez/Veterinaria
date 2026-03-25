package com.example.ejercicio3.Service.Impl;

import com.example.ejercicio3.DTO.MascotaDTO;
import com.example.ejercicio3.Model.Mascota;
import com.example.ejercicio3.Repository.MascotaRepository;
import com.example.ejercicio3.Service.MascotaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MascotaServiceImpl implements MascotaService {

    private final MascotaRepository mascotaRepository;


    @Override
    public List<Mascota> listarTodas() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota buscarPorId(Long id) {
        return mascotaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mascota no encontrada con id: " + id));
    }

    @Override
    public Mascota crear(MascotaDTO dto) {
        Mascota mascota = Mascota.builder()
                .nombre(dto.getNombre())
                .raza(dto.getRaza())
                .edad(dto.getEdad())
                .build();
        return mascotaRepository.save(mascota);
    }

    @Override
    public Mascota actualizar(Long id, MascotaDTO dto) {
        Mascota mascota = buscarPorId(id);
        mascota.setNombre(dto.getNombre());
        mascota.setRaza(dto.getRaza());
        mascota.setEdad(dto.getEdad());
        return mascotaRepository.save(mascota);
    }

    @Override
    public void eliminar(Long id) {
        buscarPorId(id);
        mascotaRepository.deleteById(id);
    }
}