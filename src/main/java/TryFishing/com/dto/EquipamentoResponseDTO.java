package TryFishing.com.dto;

import TryFishing.com.entity.Equipamento;

public record EquipamentoResponseDTO(
        Long id,
        String tipo,
        String marca,
        String modelo,
        String especificacoes
) {
    public static EquipamentoResponseDTO fromEntity(Equipamento entity) {
        return new EquipamentoResponseDTO(
                entity.getId(),
                entity.getTipo(),
                entity.getMarca(),
                entity.getModelo(),
                entity.getEspecificacoes()
        );
    }
}