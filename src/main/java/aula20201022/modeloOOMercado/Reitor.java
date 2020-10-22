package aula20201022.modeloOOMercado;

public class Reitor extends Papel {
    private String númeroAtoDaPosse;

    public Reitor(String númeroAtoDaPosse) {
        super();
        this.númeroAtoDaPosse = númeroAtoDaPosse;
    }

    public String getNúmeroAtoDaPosse() {
        return númeroAtoDaPosse;
    }

}
