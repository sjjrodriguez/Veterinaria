package com.example.ejercicio3.Controller;

import com.example.ejercicio3.DTO.MascotaDTO;
import com.example.ejercicio3.Model.Mascota;
import com.example.ejercicio3.Service.MascotaService; // ← sigue apuntando a la interfaz
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
@RequiredArgsConstructor
public class MascotaController {

    private final MascotaService mascotaService;



    @GetMapping
    public ResponseEntity<List<Mascota>> listarTodas() {
        return ResponseEntity.ok(mascotaService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mascota> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(mascotaService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Mascota> crear(@RequestBody MascotaDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(mascotaService.crear(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mascota> actualizar(@PathVariable Long id, @RequestBody MascotaDTO dto) {
        return ResponseEntity.ok(mascotaService.actualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        mascotaService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}