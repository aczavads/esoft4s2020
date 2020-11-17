package aula20201112.modeloOOMercadoPersistente.pessoa;

import javax.persistence.Entity;

@Entity
public class Fisica extends Pessoa {

    private String cpf;

    public Fisica() {
        super();
    }
    
    public Fisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

}
