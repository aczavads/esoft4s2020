package tiago_lopes_barcelos.aula20200825.carro;

public class DecimalPositivo {
    private double valor;

    public DecimalPositivo(double valor, String mensagemDeErro) {
        Validações.exceçãoSeMenorOuIgualZero(valor, mensagemDeErro);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}