package aula20201110.springBootJpa;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vinho {
    @Id
    private String id;
    private int ano;
    private String variedade;
    private String nome;

    public Vinho() {
        super();
        this.id = UUID.randomUUID().toString();
    }

    public Vinho(String nome, String variedade, int ano) {
        this();
        this.nome = nome;
        this.variedade = variedade;
        this.ano = ano;
    }

    public String getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public String getVariedade() {
        return variedade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVariedade(String variedade) {
        this.variedade = variedade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vinho)) {
            return false;
        }
        Vinho vinho = (Vinho) o;
        return Objects.equals(id, vinho.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", ano='" + getAno() + "'" +
            ", variedade='" + getVariedade() + "'" +
            ", nome='" + getNome() + "'" +
            "}";
    }

}
