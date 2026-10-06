package TryFishing.com.repository;

import TryFishing.com.entity.LocalDePesca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalDePescaRepository extends JpaRepository<LocalDePesca, Long> {
}
