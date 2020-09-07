package beatriz_ferraz.aula20200903.valueObjects;

public class Cpf {
    private String valor; 

    public Cpf(String valor){
        if(null == valor || valor.trim().length() < 11 || valor.trim().length() > 11){
            throw new RuntimeException("O CPF deve ser composto por 11 números.");
        }
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }   
    @Override
    public String toString(){
        return valor;
    }
}
