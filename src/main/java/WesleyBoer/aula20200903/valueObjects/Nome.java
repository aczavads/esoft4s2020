package WesleyBoer.aula20200903.valueObjects;

public class Nome {

    private String valor;

    public Nome() {
        if (null == valor || valor.trim().length() == 0 || valor.trim().split(" ").lenght < 2) {
            throw new RuntimeException("O nome deve conter duas palavras!");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
