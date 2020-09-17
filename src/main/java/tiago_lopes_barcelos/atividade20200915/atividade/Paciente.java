package tiago_lopes_barcelos.atividade20200915.atividade;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    
    private String nome;
    private List<Chamado> chamados = new ArrayList<>();
    private Chamado chamadoPrincipal;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void addChamado(Chamado novoChamado){
        this.chamados.add(novoChamado);
    }

    
    public  String toString() {
        String stringChamados = " Chamados: [";
        for (Chamado x : this.chamados) {
            stringChamados += x.toString() + ",";
        }
        
        return "Paciente [Nome: " + nome + "," 
            + stringChamados.substring(0, stringChamados.length()-1)
            + ", Chamado: " + chamadoPrincipal + "]";
    }

	public void setChamadoPrincipal(Chamado chamadoPrincipal) {
        if (equals(chamadoPrincipal)) {
            throw new RuntimeException ("Chamado em duplicidade.");
        }
        this.chamadoPrincipal = chamadoPrincipal;
    }

    private boolean equals(Chamado chamadoProcurado) {
        boolean achouChamado = false;
        for (Chamado x : this.chamados) {
            final boolean chamadoIgual = x.getNatureza().equals(chamadoProcurado.getNatureza());
            if (chamadoIgual) {
                achouChamado = true;                
                break;
            }
        }
        return achouChamado;
        
    }
    public Chamado getChamadoPrincipal(){
        return chamadoPrincipal;
    }
}
