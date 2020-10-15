package Felipe_Magrinelli.aula20201013;

public class Física extends Pessoa {
    public Física(String josé_de_almeida, String s) {
        super(josé_de_almeida, s);
    }

    public static class Cliente {
        private double desconto;
        private double limiteDeCredito;
        public Cliente(double desconto, double limiteDeCredito) {
            this.desconto = desconto;
            this.limiteDeCredito = limiteDeCredito;
        }
    }

    public static class Vendedor{

    }
}
