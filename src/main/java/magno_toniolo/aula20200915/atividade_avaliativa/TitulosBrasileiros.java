package magno_toniolo.aula20200915.atividade_avaliativa;

import aula20200908.associações.Endereço;

public class TitulosBrasileiros {
    private String titulo;
    private int quantidadeDeVezesQueGanhou;

    public TitulosBrasileiros (String titulo, int quantidadeDeVezesQueGanhou) {
        this.titulo = titulo;
        this.quantidadeDeVezesQueGanhou = quantidadeDeVezesQueGanhou;
        if (quantidadeDeVezesQueGanhou <= 0) {
            throw new RuntimeException("Quantidade de vitórias deve ser maior que zero");
        }
    }
    public int getQuantidadeDeVezesQueGanhou() {
        return quantidadeDeVezesQueGanhou;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Campeão do(a) " + titulo + " - " + quantidadeDeVezesQueGanhou + " vezes";
    }
}
