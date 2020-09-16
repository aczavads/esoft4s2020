package magno_toniolo.aula20200915.atividade_avaliativa;

public class Estadio {
    private String nomeEstadio;
    private String cidade;
    private String estado;

    public Estadio (String nomeEstadio, String cidade, String estado) {
        this.nomeEstadio = nomeEstadio;
        this.cidade = cidade;
        this.estado = estado;
        if (nomeEstadio.length() < 5)     {
            throw new RuntimeException("Digite um nome de estádio válido.");
        }
        if (cidade.length() < 4) {
            throw new RuntimeException("Digite um nome de cidade válido.");
        }
        if (estado.length() < 2) {
            throw new RuntimeException("Digite um nome de estado válido.");
        }
    }

    public String getNomeEstadio() {
        return nomeEstadio;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return nomeEstadio + ", localizado na cidade de " + cidade + " - " + estado;
    }

}
