package tiago_lopes_barcelos.atividade20200915.atividade;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    
    private String nome;
    List<Chamado> chamados = new ArrayList<>();
    private Chamado primeiroChamado;

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
            + ", Chamado: " + primeiroChamado + "]";
    }

	public void setprimeiroChamado(Chamado primeiroChamado) {
        if (equals(primeiroChamado)) {
            throw new RuntimeException ("Chamado em duplicidade.");
        }
        this.primeiroChamado = primeiroChamado;
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
    public Chamado getprimeiroChamado(){
        return primeiroChamado;
    }
}
