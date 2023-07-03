package sol.poente.api.entity;

import jakarta.persistence.Column;

public class PersonagemDTO {

    private Long id;

    private String nome;


    private String sobrenome;


    private String descricao;


    private String raca;


    private String afiliacao;


    private String img;

    public PersonagemDTO(){}

    public PersonagemDTO(Personagem personagem){
        this.nome = personagem.getNome();
        this.sobrenome = personagem.getSobrenome();
        this.afiliacao = personagem.getAfiliacao();
        this.descricao = personagem.getDescricao();
        this.raca = personagem.getRaca();
        this.img = personagem.getImg();
    }

    public PersonagemDTO(Long id, String nome, String sobrenome, String descricao, String raca, String afiliacao, String img) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.descricao = descricao;
        this.raca = raca;
        this.afiliacao = afiliacao;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
