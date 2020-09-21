package Felipe_Magrinelli.atividade;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        //Sensores
        List<Sensor> sensoresList1 = new ArrayList<>();
        Sensor sensor1 = new Sensor(1, "Sensor Granja 1", 31.5, 19.6);
        sensoresList1.add(sensor1);

        Sensor sensor2 = new Sensor(2, "Sensor Granja 2", 40.9, 17.95);
        sensoresList1.add(sensor2);

        String s = sensor1.informaçõesSensor();
        System.out.println(s);
        //Conservadoras
        Conservadora conservadora1 = new Conservadora("Nome da Conservadora", 1, sensoresList1, "9210912", "9323331", "Barracão 1");
        conservadora1.setSensorPrincipal(sensor2);
        System.out.println(conservadora1);

        //Tecnico
        Tecnico Felipe = new Tecnico("Felipe");
        Felipe.addConservadora(conservadora1);
        System.out.println(Felipe);
    }
}
