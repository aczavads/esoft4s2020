package Felipe_Magrinelli.aula20201022;

public class Juridica extends Pessoa {
    private String cnpj;
    public Juridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
