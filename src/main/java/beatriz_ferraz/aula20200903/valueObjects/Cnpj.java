package beatriz_ferraz.aula20200903.valueObjects;

public class Cnpj {
    private String valor;

    public Cnpj(String valor){
        if(null == valor || valor.trim().length() == 0){
            throw new RuntimeException("CNPJ não pode ser nulo.");
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
