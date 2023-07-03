package sol.poente.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sol.poente.api.entity.Personagem;
import sol.poente.api.entity.PersonagemDTO;
import sol.poente.api.repository.PersonagemRepository;

import java.util.List;

@RestController
@RequestMapping("personagens")
public class PersonagemController {

    @Autowired
    private PersonagemRepository repository;

    @GetMapping
    public Page<PersonagemDTO> listarPersonagensDTO(@PageableDefault(size = 10, sort = {"nome"})Pageable pageable){
        return repository.findAll(pageable).map(PersonagemDTO::new);
    }

    @GetMapping(value = "/normal")
    public List<Personagem> listarPersonagens(){
        return repository.findAll();
    }
}
