package TryFishing.com.controller;

import TryFishing.com.entity.Captura;

import java.time.LocalDateTime;

public record CapturaResponseDTO(
        Long id,
        LocalDateTime dataHora,
        Double pesoKg,
        Double comprimentoCm,
        Boolean pesqueESolte,
        String iscaUtilizada,
        String condicoesClimaticas,
        String fotoUrl,
        String nomeLocal,
        String nomeEspecie,
        String equipamento
) {
    public static CapturaResponseDTO fromEntity(Captura c) {
        String eqStr = (c.getEquipamento() != null)
                ? c.getEquipamento().getMarca() + " " + c.getEquipamento().getModelo()
                : null;

        return new CapturaResponseDTO(
                c.getId(),
                c.getDataHora(),
                c.getPesoKg(),
                c.getComprimentoCm(),
                c.getPesqueESolte(),
                c.getIscaUtilizada(),
                c.getCondicoesClimaticas(),
                c.getFotoUrl(),
                c.getLocal().getNome(),
                c.getEspecie().getNomePopular(),
                eqStr
        );
    }
}