package Felipe_Magrinelli.prova1;

import java.util.ArrayList;
import java.util.List;

public class Prova {
    public static void main(String[] args) {
        SensorProva sensor1 = new SensorProva(1, "Granja São Francisco", 18.50, 15);
        SensorProva sensor2 = null;

        List<SensorProva> listaSensores = new ArrayList<>();

        for(int i = 0; i <= 200; i++){
            listaSensores.add(sensor1);
        }
        sensor1.setAtivoeDescrição(true, "Esse sensor foi colocado na conservadora da Granja 2");
        System.out.println(sensor1.estaAtivo());
        System.out.println(sensor1.informaçõesSensor());
    }
}
