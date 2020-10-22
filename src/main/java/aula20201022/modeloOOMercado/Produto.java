package aula20201022.modeloOOMercado;

public class Produto extends BaseEntity {
    private String nome;

    public Produto(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
