package aula20200922.mapas_e_conjuntos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppConjuntos {

    public static void main(String[] args) {
        String[] arrayDeNomes = {"Ana", "João", "Gabriel", "Heitor", "Priscila", "Carlos", "Elaine", "Ana", "Ana", "João"};
        List<String> listaDeNomes = new ArrayList<>();
        Set<String> conjuntoDeNomes = new HashSet<>();

        for (String nome : arrayDeNomes) {
            listaDeNomes.add(nome);
            conjuntoDeNomes.add(nome);
        }

        imprimirConteúdoDaColeçãoNoConsole("Lista de nomes", listaDeNomes);
        imprimirConteúdoDaColeçãoNoConsole("Conjunto de nomes", conjuntoDeNomes);
    }

    private static void imprimirConteúdoDaColeçãoNoConsole(String mensagem, Collection<String> coleção) {
        System.out.println("Listando o conteúdo contido em [" + mensagem + "]");
        for (String valor : coleção) {
            System.out.println("   " + valor);
        }
    }
    
}
