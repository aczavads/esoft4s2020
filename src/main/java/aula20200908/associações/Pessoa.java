package aula20200908.associações;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Endereço> endereços = new ArrayList<>();
    private Endereço endereçoPrincipal;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void addEndereço(Endereço novo) {
        this.endereços.add(novo);
    }

    @Override
    public  String toString() {
        String stringEndereços = "endereços=[";
        for (Endereço e : this.endereços) {
            stringEndereços += e.toString() + ",";
        }
        
        return "Pessoa [nome=" + nome + "," 
            + stringEndereços.substring(0, stringEndereços.length()-1) 
            + ", endereçoPrincipal=" + endereçoPrincipal + "]";
    }

	public void setEndereçoPrincipal(Endereço endereçoPrincipal) {
        if (!temEndereço(endereçoPrincipal)) {
            throw new RuntimeException("O endereço informado não consta nos endereços da pessoa!");
        }
        this.endereçoPrincipal = endereçoPrincipal;
    }
    private boolean temEndereço(Endereço endereçoProcurado) {
        boolean achouEndereço = false;
        for (Endereço e : this.endereços) {
            final boolean logradouroIgual = e.getLogradouro().equals(endereçoProcurado.getLogradouro());
            final boolean númeroIgual = e.getNúmero().equals(endereçoProcurado.getNúmero());
            if (logradouroIgual && númeroIgual) {
                achouEndereço = true;
                break;
            }
        }
        return achouEndereço;
    }
    public Endereço getEndereçoPrincipal() {
        return endereçoPrincipal;
    }
}
