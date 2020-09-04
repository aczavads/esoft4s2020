package beatriz_ferraz.aula20200903.valueObjects;

public class NomeFantasia {
    private String valor;

    public NomeFantasia(String valor){
        if (null == valor || valor.trim().length() == 0) {
            throw new RuntimeException("Nome deve ter mais que um caracter.");
        }
        this.valor = valor;
    }
    
    public String getValor() {
        return valor;
    }
    @Override
    public String toString() {
        return valor;
    }
}
