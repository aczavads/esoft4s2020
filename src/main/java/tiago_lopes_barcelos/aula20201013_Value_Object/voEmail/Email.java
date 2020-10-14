package tiago_lopes_barcelos.aula20201013_Value_Object.voEmail;

public class Email {
    private String valor;

    public Email(String valor) {
        if (null == valor || valor.trim().length() == 0 || !valor.contains("@") || (valor.trim().split("@").length < 2) && (valor.trim().split(".").length < 2)) {
            throw new RuntimeException("E-mail inválido!");
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
