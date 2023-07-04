package sol.poente.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ReinoDTO {

    private Long id;

    private String nome;

    private String descricao;

    private String localizacao;

    private String afiliacao;

    private String img;

    public ReinoDTO(){}

    public ReinoDTO(Reino reino){
        this.id = reino.getId();
        this.nome = reino.getNome();
        this.descricao = reino.getDescricao();
        this.localizacao = reino.getLocalizacao();
        this.afiliacao = reino.getAfiliacao();
        this.img = reino.getImg();
    }

    public ReinoDTO(Long id, String nome, String descricao,String localizacao, String afiliacao, String img) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.localizacao = localizacao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
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
