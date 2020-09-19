package magno_toniolo.aula20200915.atividade_avaliativa;

public class Jogador {
    private String nome;
    private int numeroDaCamisa;

    public Jogador(String nome, int numeroDaCamisa) {
        this.nome = nome;
        this.numeroDaCamisa = numeroDaCamisa;
        if (nome.length() < 4 || numeroDaCamisa <= 0) {
            throw new RuntimeException(
                    "O nome deve conter mais de quatro caracteres e o número da camisa deve ser maior do que zero");
        }
    }

    public static void classificação() {
        System.out.print("'Não é o camisa 10'");
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    @Override
    public String toString() {
        /*
         * if (numeroDaCamisa == 10) { return (nome +
         * " -> ESSE É O GOLEADOR CAMISA 10!!!"); }
         */
        // else {
        return (nome + " -> camisa nº " + numeroDaCamisa + " - ");
        // }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Jogador)) {
            return false;
        }

        Jogador verificação = (Jogador) obj;

        if (nome == verificação.nome && numeroDaCamisa == verificação.numeroDaCamisa) {
            return true;
        } else {
            return false;
        }

    }
}
