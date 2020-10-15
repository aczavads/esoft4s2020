package aula20201015.modeloOOMercado;

import java.util.UUID;

public class Reitor {
    private String id;
    private String númeroAtoDaPosse;

    public Reitor(String númeroAtoDaPosse) {
        this.númeroAtoDaPosse = númeroAtoDaPosse;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getNúmeroAtoDaPosse() {
        return númeroAtoDaPosse;
    }

}
