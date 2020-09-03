package aula20200903.valueObjects;

public class Nome {
    private String valor;

    public Nome(String valor) {
        if (null == valor || valor.trim().length() == 0 || valor.trim().split(" ").length < 2) {
            throw new RuntimeException("O nome deve conter duas palavras!");
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
