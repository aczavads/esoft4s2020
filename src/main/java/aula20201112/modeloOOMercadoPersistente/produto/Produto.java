package aula20201112.modeloOOMercadoPersistente.produto;

import javax.persistence.Entity;

import aula20201112.modeloOOMercadoPersistente.BaseEntity;

@Entity
public class Produto extends BaseEntity {
    private String nome;

    public Produto() {
        super();
    }

    public Produto(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "{" +
        " id='" + getId() + "'," +
        " nome='" + getNome() + "'" +
            "}";
    }


}
