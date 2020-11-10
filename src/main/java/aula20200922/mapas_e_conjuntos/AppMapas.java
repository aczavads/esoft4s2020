package aula20200922.mapas_e_conjuntos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AppMapas {

    //Acumulado de chuvas por sigla de unidade federativa
    //chave       |     valor
    //PR          |     20.5
    //SC          |     37.7
    //AC          |    127.0

    //Valor total vendido por grupo de produtos
    //chave       |          valor
    //CEREAIS     |   1_125_655.33
    //LACTEOS     |   2_000_655.15
    
    
	public static void main(String[] args) {
        Map<String, Double> chuvaAcumuladaPorUF = new HashMap<>();

        adicionarMediçãoPluviométrica(chuvaAcumuladaPorUF, "PR",10.0);
        adicionarMediçãoPluviométrica(chuvaAcumuladaPorUF, "PR",10.5);
        adicionarMediçãoPluviométrica(chuvaAcumuladaPorUF, "SC",20.7);
        adicionarMediçãoPluviométrica(chuvaAcumuladaPorUF, "SC", 7.0);
        adicionarMediçãoPluviométrica(chuvaAcumuladaPorUF, "SC",10.0);
        adicionarMediçãoPluviométrica(chuvaAcumuladaPorUF, "AC",127.0);

        System.out.println("Tem a chave SP no mapa? " + chuvaAcumuladaPorUF.containsKey("SP"));
        System.out.println("Tem a chave PR no mapa? " + chuvaAcumuladaPorUF.containsKey("PR"));

        System.out.println("Valores do mapa 'chuvaAcumuladaPorUF'");
        //O método remove requer a chave que identifica a entrada, neste caso, a sigla daUF que desejamos remover do mapa.
        //chuvaAcumuladaPorUF.remove("AC");
        for (Entry<String, Double> registro : chuvaAcumuladaPorUF.entrySet()) {
            System.out.println("  " + registro.getKey() + " ==> " + registro.getValue());
        }
        System.out.println("Fim do mapa.");
    }

    private static void adicionarMediçãoPluviométrica(
        Map<String, Double> acumuladoPorUF, String siglaDaUF, double volumeMedido) {
        if (acumuladoPorUF.containsKey(siglaDaUF)) {
            Double volumeAcumulado = acumuladoPorUF.get(siglaDaUF);
            volumeAcumulado = volumeAcumulado + volumeMedido;
            acumuladoPorUF.put(siglaDaUF, volumeAcumulado);
        } else {
            acumuladoPorUF.put(siglaDaUF, volumeMedido);
        }       
    }
    
}
