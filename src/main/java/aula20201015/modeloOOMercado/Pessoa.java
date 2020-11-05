package aula20201015.modeloOOMercado;

import java.util.UUID;

public abstract class Pessoa {
    private String id;
    private String nome;
    private Reitor reitor;

    public Pessoa() {
        this.id = UUID.randomUUID().toString();
    }

    public Pessoa(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void setReitor(Reitor reitor) {
        this.reitor = reitor;
    }
    
    public boolean isReitor() {
        return reitor != null;
    }

    public Reitor getReitor() {
        return reitor;
    }

}
