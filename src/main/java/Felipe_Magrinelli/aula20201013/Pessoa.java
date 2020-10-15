package Felipe_Magrinelli.aula20201013;

import java.lang.reflect.Field;

public abstract class Pessoa {
    private String nomePessoa;
    private EmailVO email;
    private String codigo;
    private String telefone;

    public Pessoa(String nomePessoa, String codigo){
        this.nomePessoa = nomePessoa;
        this.codigo = codigo;
    }
    public void setFornecedor(Jurídica.Fornecedor Fornecedor){

    }

    public void setCliente(Física.Cliente Cliente){

    }

    public void setVendedor(Física.Vendedor Vendedor){

    }

    public void setTransportadora(Jurídica.Transportadora Transportadora){

    }
    public void bloquearFornecedor(){

    }

    public void desbloquearFornecedor(){

    }
}
