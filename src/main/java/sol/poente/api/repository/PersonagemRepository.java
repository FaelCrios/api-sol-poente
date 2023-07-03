package sol.poente.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sol.poente.api.entity.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository <Personagem, Long>{
}
