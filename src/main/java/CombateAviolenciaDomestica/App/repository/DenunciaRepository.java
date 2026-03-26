package CombateAviolenciaDomestica.App.repository;

import CombateAviolenciaDomestica.App.models.DenunciarCaso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DenunciaRepository extends JpaRepository<DenunciarCaso, Long> {
}