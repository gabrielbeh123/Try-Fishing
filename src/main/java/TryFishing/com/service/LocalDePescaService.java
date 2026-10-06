package TryFishing.com.service;

import TryFishing.com.dto.LocalDePescaRequestDTO;
import TryFishing.com.dto.LocalDePescaResponseDTO;
import TryFishing.com.entity.LocalDePesca;
import TryFishing.com.repository.LocalDePescaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocalDePescaService {

    private final LocalDePescaRepository repository;

    @Transactional
    public LocalDePescaResponseDTO salvar(LocalDePescaRequestDTO dto) {
        LocalDePesca entity = new LocalDePesca();
        entity.setNome(dto.nome());
        entity.setTipo(dto.tipo());
        entity.setCidade(dto.cidade());
        entity.setEstado(dto.estado());
        entity.setLatitude(dto.latitude());
        entity.setLongitude(dto.longitude());
        entity.setObservacoes(dto.observacoes());

        return LocalDePescaResponseDTO.fromEntity(repository.save(entity));
    }

    @Transactional(readOnly = true)
    public List<LocalDePescaResponseDTO> listarTodos() {
        return repository.findAll()
                .stream()
                .map(LocalDePescaResponseDTO::fromEntity)
                .toList();
    }

    @Transactional(readOnly = true)
    public LocalDePescaResponseDTO buscarPorId(Long id) {
        LocalDePesca entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Local de pesca não encontrado com o ID: " + id));
        return LocalDePescaResponseDTO.fromEntity(entity);
    }

    @Transactional
    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Local de pesca não encontrado com o ID: " + id);
        }
        repository.deleteById(id);
    }
}