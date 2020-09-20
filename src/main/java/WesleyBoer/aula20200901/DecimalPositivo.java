package WesleyBoer.aula20200901;

public class DecimalPositivo {
    private double valor;

    public DecimalPositivo (double valor, String mensagemDeErro) {
        Validacoes.excecaoSeMenorIgualZero(valor, mensagemDeErro);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

}
