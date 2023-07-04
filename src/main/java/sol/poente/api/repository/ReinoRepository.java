package sol.poente.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sol.poente.api.entity.Reino;

@Repository
public interface ReinoRepository extends JpaRepository<Reino, Long> {

    public Reino findByLocalizacao(String localizacao);

}
