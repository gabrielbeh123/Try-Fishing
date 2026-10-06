package TryFishing.com.controller;

import TryFishing.com.dto.EspecieRequestDTO;
import TryFishing.com.dto.EspecieResponseDTO;
import TryFishing.com.service.EspecieService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/especies")
@RequiredArgsConstructor
public class EspecieController {

    private final EspecieService service;

    @PostMapping
    public ResponseEntity<EspecieResponseDTO> criar(@Valid @RequestBody EspecieRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(dto));
    }

    @GetMapping
    public ResponseEntity<List<EspecieResponseDTO>> listarTodas() {
        return ResponseEntity.ok(service.listarTodas());
    }
}