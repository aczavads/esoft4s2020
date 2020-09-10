package magno_toniolo.aula20200908.associações;

import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private List<Endereço> endereços = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addEndereço(Endereço novo) {
        this.endereços.add(novo);
    }

    @Override       //Estou dizendo que a minha subclasse vai reimplementar o método da superclasse     
    public String toString() {
        String stringEndereços = "endereços =[";
        for (Endereço e : this.endereços) {
            stringEndereços += e.toString() + ", ";
        }
        return "Pessoa [nome = " + nome + "]";
    }

}
