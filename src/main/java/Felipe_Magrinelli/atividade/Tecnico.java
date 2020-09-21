package Felipe_Magrinelli.atividade;

import Felipe_Magrinelli.aula20200903.valueObjects.Nome;

import java.util.ArrayList;
import java.util.List;

public class Tecnico {
    private String nomeTecnico;
    private List<Conservadora> conservadoras = new ArrayList<>();

    public Tecnico(){

    }

    public Tecnico (String nome){
        this.nomeTecnico = nome;
    }

    public void addConservadora(Conservadora conservadoraPassada){
        this.conservadoras.add(conservadoraPassada);
    }


    public String toString() {
        return "Tecnico: " + nomeTecnico;
    }
}
