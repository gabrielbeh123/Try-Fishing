package TryFishing.com.dto;

import TryFishing.com.entity.LocalDePesca;

public record LocalDePescaResponseDTO(
        Long id,
        String nome,
        String tipo,
        String cidade,
        String estado,
        Double latitude,
        Double longitude,
        String observacoes
) {
    public static LocalDePescaResponseDTO fromEntity(LocalDePesca entity) {
        return new LocalDePescaResponseDTO(
                entity.getId(),
                entity.getNome(),
                entity.getTipo(),
                entity.getCidade(),
                entity.getEstado(),
                entity.getLatitude(),
                entity.getLongitude(),
                entity.getObservacoes()
        );
    }
}