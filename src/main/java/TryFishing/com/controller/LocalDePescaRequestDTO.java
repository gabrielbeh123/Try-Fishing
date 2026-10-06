package TryFishing.com.controller;

import jakarta.validation.constraints.NotBlank;

public record LocalDePescaRequestDTO(
        @NotBlank(message = "O nome do local é obrigatório")
        String nome,
        String tipo,
        String cidade,
        String estado,
        Double latitude,
        Double longitude,
        String observacoes
) {}