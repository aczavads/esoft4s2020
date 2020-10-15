package aula20201015.modeloOOMercado;

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
