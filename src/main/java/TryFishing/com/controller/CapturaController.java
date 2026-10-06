package TryFishing.com.controller;

import TryFishing.com.dto.CapturaRequestDTO;
import TryFishing.com.dto.CapturaResponseDTO;
import TryFishing.com.service.CapturaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/capturas")
@RequiredArgsConstructor
public class CapturaController {

    private final CapturaService service;

    @PostMapping
    public ResponseEntity<CapturaResponseDTO> registrar(@Valid @RequestBody CapturaRequestDTO dto) {
        CapturaResponseDTO response = service.registrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<Page<CapturaResponseDTO>> listarTodas(
            @PageableDefault(size = 10, sort = "dataHora") Pageable pageable) {
        return ResponseEntity.ok(service.listarComPaginacao(pageable));
    }
}