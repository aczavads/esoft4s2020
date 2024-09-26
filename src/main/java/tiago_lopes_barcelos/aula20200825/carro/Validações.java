package tiago_lopes_barcelos.aula20200825.carro;

public abstract class Validações {

        public static void exceçãoSeMenorOuIgualZero(double valor, String mensagemDeErro) {
            if (valor <= 0.00) {
                throw new RuntimeException(mensagemDeErro);
            }
        }
}