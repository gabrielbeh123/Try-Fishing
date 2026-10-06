package TryFishing.com.dto;

import jakarta.validation.constraints.NotBlank;

public record EspecieRequestDTO(
        @NotBlank(message = "Nome popular é obrigatório")
        String nomePopular,
        String nomeCientifico,
        Double tamanhoMinimoAbateCm,
        String epocaDefeso
) {}