package magno_toniolo.aula20200915.atividade_avaliativa;

import java.util.ArrayList;
import java.util.List;

public class Time {
    
    private String nome;
    private List<Jogador> jogadoresDoTime = new ArrayList<>();
    private Estadio estadioDoTime;
    private List<TitulosBrasileiros> titulosBrasileiros = new ArrayList<>();

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addJogador (Jogador novoJogador) {
        this.jogadoresDoTime.add(novoJogador);
    }

    public List<Jogador> getJogadoresDoTime() {
        return jogadoresDoTime;
    }

	public void addTitulo(TitulosBrasileiros novoTitulo) {
        this.titulosBrasileiros.add(novoTitulo);
    }

    public List<TitulosBrasileiros> getTitulosBrasileiros() {
        return titulosBrasileiros;
    }

    public Estadio getEstadioDoTime() {
        return estadioDoTime;
    }
    public void setEstadioDoTime(Estadio estadioDoTime) {
        this.estadioDoTime = estadioDoTime;
    }
    
    @Override
    public String toString() {
        return (nome.toUpperCase());
    }

}
