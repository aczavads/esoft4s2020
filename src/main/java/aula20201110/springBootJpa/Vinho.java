package aula20201110.springBootJpa;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vinho {
    @Id
    private String id;
    private int ano;
    private String variedade;
    private String nome;

    @Temporal(TemporalType.DATE)
    private Date envasadoEm;

    public Vinho() {
        super();
        this.id = UUID.randomUUID().toString();
    }

    public Vinho(String nome, String variedade, int ano, Date envasadoEm) {
        this();
        this.nome = nome;
        this.variedade = variedade;
        this.ano = ano;
		this.envasadoEm = envasadoEm;
    }

    public Date getEnvasadoEm() {
        return envasadoEm;
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

    public void setEnvasadoEm(Date envasadoEm) {
        this.envasadoEm = envasadoEm;
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
            ", envasadoEm='" + getEnvasadoEm() + "'" +
            ", variedade='" + getVariedade() + "'" +
            ", nome='" + getNome() + "'" +
            "}";
    }

}
