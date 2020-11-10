package Felipe_Magrinelli.aula20201015;

public class Juridica extends Pessoa {
    private String cnpj;

    public Juridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }
}
