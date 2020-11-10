package Felipe_Magrinelli.aula20201020;

public class Fisica extends Pessoa {
    private String cpf;

    public Fisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
