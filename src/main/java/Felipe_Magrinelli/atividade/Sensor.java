package Felipe_Magrinelli.atividade;

public class Sensor {
    private int idSensor;
    private String nomeSensor;
    private double temperaturaMax;
    private double temperaturaMin;

    public Sensor(){

    }

    public Sensor(int idSensor, String nomeSensor, double temperaturaMax, double temperaturaMin){
        this.idSensor = idSensor;
        this.nomeSensor = nomeSensor;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }
    public int getIdSensor(){
        return idSensor;
    }

    public void setNomeSensor(String nomeSensor) {
        this.nomeSensor = nomeSensor;
    }

    public void setTemperaturas (double temperaturaMin, double temperaturaMax){
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }

    public String informaçõesSensor(){
            return "Nome: " + nomeSensor +
                ", Id: " + idSensor +
                ", Temperatura Max: " + temperaturaMax +
                ", Temperatura Min: " + temperaturaMin;
    }

    @Override
    public String toString(){
        return nomeSensor;
    }
}
