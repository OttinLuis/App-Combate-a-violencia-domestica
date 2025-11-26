package CombateAviolenciaDomestica.App.repository;

import CombateAviolenciaDomestica.App.models.SuportePsicologico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuportePsicologicoRepository extends JpaRepository<SuportePsicologico, Long> {
}
