package main.java.Felipe_Magrinelli.atvAvaliativa4S;


import java.util.ArrayList;
import java.util.List;

public class Gerente extends Pessoa{
    List<Tecnico> tecnicosGerenciados = new ArrayList<>();

    public Gerente(String nome){
        super(nome);
    }
    
    public void addTecnicoGerenciado (Tecnico tecnico){
        for(Tecnico t : tecnicosGerenciados){
            if(t.equals(tecnico)){
                throw new RuntimeException("Essa técnico ja foi adicionado à esse gerente!");
            }
        }
        tecnicosGerenciados.add(tecnico);
    }

    public List<Tecnico> getTecnicosGerenciados() {
        return tecnicosGerenciados;
    }

    public String toString() {
        if(super.getVeiculo() != null){
            return  "\n======Gerente======" +
                "\nNome: " + getNome() +
                "\nId: " + getId() +
                "\nVeiculo: " + super.getNomeVeiculo();
        }else{
            return  "\n======Gerente======" +
                "\nNome: " + getNome() +
                "\nId: " + getId();
        }
    }
}
