package aula20201112.modeloOOMercadoPersistente.pessoa;

import javax.persistence.Entity;

@Entity
public class Juridica extends Pessoa {
	private String cnpj;


    public Juridica() {
        super();
    }
    
    public Juridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }

}
