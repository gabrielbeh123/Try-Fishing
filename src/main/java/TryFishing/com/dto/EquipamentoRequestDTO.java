package TryFishing.com.dto;

import jakarta.validation.constraints.NotBlank;

public record EquipamentoRequestDTO(
        @NotBlank(message = "Tipo de equipamento é obrigatório")
        String tipo,
        String marca,
        String modelo,
        String especificacoes
) {}