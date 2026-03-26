package CombateAviolenciaDomestica.App.repository;

import CombateAviolenciaDomestica.App.models.SuportePsicologico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuportePsicologicoRepository extends JpaRepository<SuportePsicologico, Long> {

    long countByNomePsicologaIsNotNull();
    long countByNomeOngIsNotNull();
}