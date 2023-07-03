package sol.poente.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sol.poente.api.entity.PersonagemDTO;
import sol.poente.api.entity.Reino;
import sol.poente.api.entity.ReinoDTO;
import sol.poente.api.repository.ReinoRepository;

import java.util.List;

@RestController
@RequestMapping("reinos")
public class ReinoController {

    @Autowired
    private ReinoRepository repository;


    @GetMapping
    public Page<ReinoDTO> listarReinosDTO(@PageableDefault(size = 10, sort = {"nome"})Pageable pageable){
        return repository.findAll(pageable).map(ReinoDTO::new);
    }

    @GetMapping(value = "/normal")
    public List<Reino> listarReinos(){
        return repository.findAll();
    }
}
