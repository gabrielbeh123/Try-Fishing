package TryFishing.com.service;

import TryFishing.com.dto.CapturaRequestDTO;
import TryFishing.com.dto.CapturaResponseDTO;
import TryFishing.com.entity.Captura;
import TryFishing.com.entity.Equipamento;
import TryFishing.com.entity.Especie;
import TryFishing.com.entity.LocalDePesca;
import TryFishing.com.repository.CapturaRepository;
import TryFishing.com.repository.EquipamentoRepository;
import TryFishing.com.repository.EspecieRepository;
import TryFishing.com.repository.LocalDePescaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CapturaService {

    private final CapturaRepository capturaRepository;
    private final LocalDePescaRepository localRepository;
    private final EspecieRepository especieRepository;
    private final EquipamentoRepository equipamentoRepository;

    @Transactional
    public CapturaResponseDTO registrar(CapturaRequestDTO dto) {
        LocalDePesca local = localRepository.findById(dto.localId())
                .orElseThrow(() -> new RuntimeException("Local não encontrado: " + dto.localId()));

        Especie especie = especieRepository.findById(dto.especieId())
                .orElseThrow(() -> new RuntimeException("Espécie não encontrada: " + dto.especieId()));

        Equipamento equipamento = null;
        if (dto.equipamentoId() != null) {
            equipamento = equipamentoRepository.findById(dto.equipamentoId()).orElse(null);
        }

        Captura captura = new Captura();
        captura.setDataHora(dto.dataHora());
        captura.setPesoKg(dto.pesoKg());
        captura.setComprimentoCm(dto.comprimentoCm());
        captura.setPesqueESolte(dto.pesqueESolte());
        captura.setIscaUtilizada(dto.iscaUtilizada());
        captura.setCondicoesClimaticas(dto.condicoesClimaticas());
        captura.setFotoUrl(dto.fotoUrl());
        captura.setLocal(local);
        captura.setEspecie(especie);
        captura.setEquipamento(equipamento);

        return CapturaResponseDTO.fromEntity(capturaRepository.save(captura));
    }

    @Transactional(readOnly = true)
    public Page<CapturaResponseDTO> listarComPaginacao(Pageable pageable) {
        return capturaRepository.findAll(pageable)
                .map(CapturaResponseDTO::fromEntity);
    }
}