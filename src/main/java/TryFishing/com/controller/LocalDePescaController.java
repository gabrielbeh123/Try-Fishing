package TryFishing.com.controller;

import TryFishing.com.dto.LocalDePescaRequestDTO;
import TryFishing.com.dto.LocalDePescaResponseDTO;
import TryFishing.com.service.LocalDePescaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/locais")
@RequiredArgsConstructor
public class LocalDePescaController {

    private final LocalDePescaService service;

    @PostMapping
    public ResponseEntity<LocalDePescaResponseDTO> criar(@Valid @RequestBody LocalDePescaRequestDTO dto) {
        LocalDePescaResponseDTO response = service.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<LocalDePescaResponseDTO>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LocalDePescaResponseDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}