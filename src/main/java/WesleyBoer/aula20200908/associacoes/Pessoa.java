package WesleyBoer.aula20200908.associacoes;

import java.util.List;
import java.util.ArrayList;

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
    public String toString() {
        String stringEndereços = "endereços=[";
        for (Endereço e : this.endereços) {
            stringEndereços += e.toString() + ",";
        }
        return "Pessoa [nome=" + nome + "," + stringEndereços.substring(0, stringEndereços.length()-1 + "]";
    }

    public void setEndereçoPrincipal(Endereço endereçoPrincipal) {
        boolean achouEndereço = false;
        for (Endereço e : this.endereços) {
            if (e.getLogradouro().equals(endereçoPrincipal.getLogradouro())
                    && e.getNumero().equals(endereçoPrincipal.getNumero())) {
                achouEndereço = true;
                break;
            }
        }
        if (!achouEndereço) {
            throw new RuntimeException("O endereço informado não consta nos endereços da pessoa!");
        }
        this.endereçoPrincipal = endereçoPrincipal;
    }

    public Endereço getEndereçoPrincipal() {
        return endereçoPrincipal;
    }
}
