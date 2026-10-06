package TryFishing.com.dto;

import TryFishing.com.entity.Especie;

public record EspecieResponseDTO(
        Long id,
        String nomePopular,
        String nomeCientifico,
        Double tamanhoMinimoAbateCm,
        String epocaDefeso
) {
    public static EspecieResponseDTO fromEntity(Especie entity) {
        return new EspecieResponseDTO(
                entity.getId(),
                entity.getNomePopular(),
                entity.getNomeCientifico(),
                entity.getTamanhoMinimoAbateCm(),
                entity.getEpocaDefeso()
        );
    }
}