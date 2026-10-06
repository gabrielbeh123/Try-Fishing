package TryFishing.com.dto;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record CapturaRequestDTO(
        @NotNull(message = "Data e hora são obrigatórias")
        LocalDateTime dataHora,
        Double pesoKg,
        Double comprimentoCm,
        Boolean pesqueESolte,
        String iscaUtilizada,
        String condicoesClimaticas,
        String fotoUrl,
        @NotNull(message = "O ID do local é obrigatório")
        Long localId,
        @NotNull(message = "O ID da espécie é obrigatório")
        Long especieId,
        Long equipamentoId
) {}