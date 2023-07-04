package sol.poente.api.entity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sol.poente.api.entity.Reino;
import sol.poente.api.repository.ReinoRepository;

import java.util.List;

@Service
public class ReinoService {

    @Autowired
    private ReinoRepository repo;

    public List<Reino> findAll(){
        return repo.findAll();
    }



}
