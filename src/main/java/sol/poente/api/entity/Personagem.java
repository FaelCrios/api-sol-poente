package sol.poente.api.entity;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "personagens")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "raca")
    private String raca;

    @Column(name = "afiliacao")
    private String afiliacao;

    @Column(name = "img")
    private String img;

    public Personagem(){}

    public Personagem(Long id, String nome, String sobrenome, String descricao, String raca, String afiliacao, String img) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem that = (Personagem) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(sobrenome, that.sobrenome) && Objects.equals(descricao, that.descricao) && Objects.equals(raca, that.raca) && Objects.equals(afiliacao, that.afiliacao) && Objects.equals(img, that.img);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, sobrenome, descricao, raca, afiliacao, img);
    }
}
