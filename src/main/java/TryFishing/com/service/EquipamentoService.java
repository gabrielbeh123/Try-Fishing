package TryFishing.com.service;

import TryFishing.com.dto.EquipamentoRequestDTO;
import TryFishing.com.dto.EquipamentoResponseDTO;
import TryFishing.com.entity.Equipamento;
import TryFishing.com.repository.EquipamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipamentoService {

    private final EquipamentoRepository repository;

    @Transactional
    public EquipamentoResponseDTO salvar(EquipamentoRequestDTO dto) {
        Equipamento entity = new Equipamento();
        entity.setTipo(dto.tipo());
        entity.setMarca(dto.marca());
        entity.setModelo(dto.modelo());
        entity.setEspecificacoes(dto.especificacoes());

        return EquipamentoResponseDTO.fromEntity(repository.save(entity));
    }

    @Transactional(readOnly = true)
    public List<EquipamentoResponseDTO> listarTodos() {
        return repository.findAll().stream()
                .map(EquipamentoResponseDTO::fromEntity)
                .toList();
    }
}