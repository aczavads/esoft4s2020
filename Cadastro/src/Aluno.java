public class Aluno extends Pessoa {

    private String ra;

    public Aluno(String nome, int idade, char genero) {
        super(nome, idade, genero);
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }