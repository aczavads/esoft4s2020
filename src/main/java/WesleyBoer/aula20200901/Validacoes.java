package WesleyBoer.aula20200901;

public abstract class Validacoes {

    public static void excecaoSeMenorIgualZero(double valor, String mensagemDeErro) {
        if (valor <= 0.00) {
            throw new RuntimeException(mensagemDeErro);
        }
    }
}