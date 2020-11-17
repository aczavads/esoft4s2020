package aula20201020.modeloOOMercado;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Pessoa {
    private String id;
    private String nome;
    private List<Papel> papéis = new ArrayList<>();

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

}
