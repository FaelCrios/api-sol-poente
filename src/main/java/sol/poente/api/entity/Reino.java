package sol.poente.api.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "reinos")
public class Reino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "afiliacao")
    private String afiliacao;

    @Column(name = "img")
    private String img;

    public Reino(){}

    public Reino(Long id, String nome, String descricao, String afiliacao, String img) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reino reino = (Reino) o;
        return Objects.equals(id, reino.id) && Objects.equals(nome, reino.nome) && Objects.equals(descricao, reino.descricao) && Objects.equals(afiliacao, reino.afiliacao) && Objects.equals(img, reino.img);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, afiliacao, img);
    }
}
