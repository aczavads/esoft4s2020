package Felipe_Magrinelli.atividade;

import java.util.ArrayList;
import java.util.List;

public class Conservadora {
    private String nomeConservadora;
    private final int id;
    private List<Sensor> sensores = new ArrayList<>();
    private Sensor sensorPrincipal;
    private String latitude;
    private String longitude;
    private String barracao;

    public Conservadora(String nomeConservadora,int idConservadora, List<Sensor> sensores, String latitude, String longitude, String barracao) {
        this.nomeConservadora = nomeConservadora;
        this.id = idConservadora;
        this.sensores = sensores;
        this.latitude = latitude;
        this.longitude = longitude;
        this.barracao = barracao;
    }

    public void setSensorPrincipal(Sensor sensorPrincipalPassado) {
        if (sensorNaLista(sensorPrincipalPassado)) {
            this.sensorPrincipal = sensorPrincipalPassado;
        } else {
            throw new RuntimeException("O sensor indicado não estava na lista dessa conservadora");
        }
    }

    private boolean sensorNaLista(Sensor sensorPassado) {
        boolean sensor = false;
        for (Sensor s : this.sensores) {
            if (s.getIdSensor() == sensorPassado.getIdSensor()) {
                sensor = true;
                break;
            }
        }
        return sensor;
    }

    public String getSensorPrincipal(){
        return "Sensor Principal: " + sensorPrincipal;
    }

    @Override
    public String toString(){
        String todosSensores = "Sensores=[";
        for (Sensor s : this.sensores) {
            todosSensores += s.toString() + ",";
        }

        return "Conservadora: " + nomeConservadora +
                "; Id: "+ id +
                "; Lat: " + latitude + ", Long: " + longitude +
                "; Sensor Principal: " + sensorPrincipal + " "
                + todosSensores.substring(0, todosSensores.length()-1) + "]" +
                ", Barracão: " + barracao;
    }
}