package magno_toniolo.aula20200908.associações;

public class Endereço {

    public Endereço(String logradouro, String número) {
        this.logradouro = logradouro;
        this.número = número;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getNúmero() {
        return número;
    }
    @Override
    public String toString() {
        return "E"
    }


}
