package aula20201112.modeloOOMercadoPersistente.pessoa.papel;

import javax.persistence.Entity;

@Entity
public class Reitor extends Papel {
    private String númeroAtoDaPosse;

    public Reitor() {
        super();
    }

    public Reitor(String númeroAtoDaPosse) {
        this();
        this.númeroAtoDaPosse = númeroAtoDaPosse;
    }

    public String getNúmeroAtoDaPosse() {
        return númeroAtoDaPosse;
    }

}
