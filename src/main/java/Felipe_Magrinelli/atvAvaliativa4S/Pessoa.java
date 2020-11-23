package main.java.Felipe_Magrinelli.atvAvaliativa4S;

import java.util.UUID;
import javax.swing.JOptionPane;

public abstract class Pessoa {
    private String id;
    private String nome;
    private Veiculo veiculo = null;

    public Pessoa(){
        this.id = UUID.randomUUID().toString();
    }

    public Pessoa(String nome){
        this();
        this.nome = nome;
    }

    public String getNomeVeiculo() {
        return veiculo.getNome();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
}
