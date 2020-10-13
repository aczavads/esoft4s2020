package beatriz_ferraz.aula20201013.ValueObject;

public class Telefone {
    private String valor;

    public Telefone(String valor) {
        //numero residencial + DDD = 10 dígitos
        //numero de celular + DDD = 11 dígitos
        if(valor == null || valor.trim().length() < 10) { 
            throw new RuntimeException("Telefone inválido.");
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
