package aula20201112.modeloOOMercadoPersistente.pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import aula20201112.modeloOOMercadoPersistente.BaseEntity;
import aula20201112.modeloOOMercadoPersistente.pessoa.papel.Cliente;
import aula20201112.modeloOOMercadoPersistente.pessoa.papel.Papel;
import aula20201112.modeloOOMercadoPersistente.pessoa.papel.Reitor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa extends BaseEntity{
    private String nome;
    
    //@Transient
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoa_id")
    private Set<Papel> papéis = new HashSet<>();

    public Pessoa() {
        super();
    }

    public Pessoa(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void assumirPapel(Papel papel) {
        for (Papel papelExistente : papéis) {
            if (papelExistente.getClass().equals(papel.getClass())) {
                throw new RuntimeException("Esta pessoa já possuí o papel [" + papel.getClass().getSimpleName()  +"]");
            }
        }
        this.papéis.add(papel);
    }
   
    public boolean isReitor() {
        for (Papel papel : papéis) {
            if (papel instanceof Reitor) {
                return true;
            }
        }
        return false;
    }

    public Reitor getReitor() {
        for (Papel papel : papéis) {
            if (papel instanceof Reitor) {
                return (Reitor) papel;
            }
        }
        return null;
    }

	public boolean isCliente() {
        for (Papel papel : papéis) {
            if (papel instanceof Cliente) {
                return true;
            }
        }
        return false;
    }
    
    public List<Papel> getPapéis() {
        return new ArrayList<>(papéis);
    }

}
