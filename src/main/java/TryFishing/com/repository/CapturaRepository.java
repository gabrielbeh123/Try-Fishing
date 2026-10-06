package TryFishing.com.repository;

import TryFishing.com.entity.Captura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapturaRepository extends JpaRepository<Captura, Long> {
    Page<Captura> findByLocalId(Long localId, Pageable pageable);
}