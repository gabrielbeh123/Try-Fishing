package TryFishing.com.service;

import TryFishing.com.dto.EspecieRequestDTO;
import TryFishing.com.dto.EspecieResponseDTO;
import TryFishing.com.entity.Especie;
import TryFishing.com.repository.EspecieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EspecieService {

    private final EspecieRepository repository;

    @Transactional
    public EspecieResponseDTO salvar(EspecieRequestDTO dto) {
        Especie entity = new Especie();
        entity.setNomePopular(dto.nomePopular());
        entity.setNomeCientifico(dto.nomeCientifico());
        entity.setTamanhoMinimoAbateCm(dto.tamanhoMinimoAbateCm());
        entity.setEpocaDefeso(dto.epocaDefeso());

        return EspecieResponseDTO.fromEntity(repository.save(entity));
    }

    @Transactional(readOnly = true)
    public List<EspecieResponseDTO> listarTodas() {
        return repository.findAll().stream()
                .map(EspecieResponseDTO::fromEntity)
                .toList();
    }
}
