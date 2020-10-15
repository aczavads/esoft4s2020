package Felipe_Magrinelli.prova1;

public class SensorProva {
    private int idSensor;
    private String nomeSensor;
    private double temperaturaMax;
    private double temperaturaMin;
    private String descrição;
    private boolean ativo;

    public SensorProva(){

    }

    public SensorProva(int idSensor, String nomeSensor, double temperaturaMax, double temperaturaMin){
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

    public void setAtivoeDescrição(Boolean ativo, String descrição){
        this.ativo = ativo;
        this.descrição = descrição;
    }

    public String informaçõesSensor(){
        if(!(descrição == null)) {
            return "Nome: " + nomeSensor +
                    ", Id: " + idSensor +
                    ", Temperatura Max: " + temperaturaMax +
                    ", Temperatura Min: " + temperaturaMin +
                    ", Esta ativo: " + ativo +
                    ", Descrição: " + descrição;
        }else{
            return "Nome: " + nomeSensor +
                    ", Id: " + idSensor +
                    ", Temperatura Max: " + temperaturaMax +
                    ", Temperatura Min: " + temperaturaMin +
                    ", Esta ativo: " + ativo;
        }
    }

    public boolean estaAtivo() {
        if (!this.ativo) {
            this.ativo = true;
            return ativo;
        } else {
            this.ativo = false;
            return ativo;
        }
    }

    @Override
    public String toString(){
        return nomeSensor;
    }
}
