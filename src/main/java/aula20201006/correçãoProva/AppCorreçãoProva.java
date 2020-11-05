package aula20201006.correçãoProva;

import java.util.List;

public class AppCorreçãoProva {

    public static void main(String[] args) {

        List<String> nomes = new MinhaListaDeStringsQueNãoAceitaNomesVazios();
        nomes.add("Ana");
        nomes.add("Jonas");
        nomes.add("Elison");
        nomes.add("Adelaide");        
        nomes.add("");        
        nomes.add("       ");        
        //nomes.add(500.77);        

        for (Object obj : nomes) {
            System.out.println(obj);
        }

    }

    
}
