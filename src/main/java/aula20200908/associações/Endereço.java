package aula20200908.associações;

public class Endereço {
	private String logradouro;
    private String número;

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
        return "Endereço [logradouro=" + logradouro + ", número=" + número +"]";
    }

}
