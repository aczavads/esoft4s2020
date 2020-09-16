package magno_toniolo.aula20200915.atividade_avaliativa;

public class Jogador {
    private String nome;
    private int numeroDaCamisa; 
    private boolean camisa10;

    public Jogador (String nome, int numeroDaCamisa) {
        this.nome = nome;
        this.numeroDaCamisa = numeroDaCamisa;
        if(nome.length() < 4 || numeroDaCamisa <= 0) {
            throw new RuntimeException("O nome deve conter mais de quatro caracteres e o número da camisa deve ser maior do que zero");
        }
        /*if(numeroDaCamisa == 10) {

        }*/
    }
    public String getNome() {
        return nome;
    }
    public int getNumeroDaCamisa() {
        return numeroDaCamisa;
    }
    
    @Override
    public String toString() {
        if (numeroDaCamisa == 10)
        {
            return (nome + " -> ESSE É O GOLEADOR CAMISA 10!!!");
        }
        else {
            return (nome + " -> camisa nº " + numeroDaCamisa);
        }
    }
}
