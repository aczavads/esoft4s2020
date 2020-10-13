package magno_toniolo.teste.teste_2;

public class Animal {

    private String nome;
    private boolean bravo;

    public String getNome() { // retorna a variável do tipo String "nome" do objeto
        return nome;
    }

    public boolean getBravo() { // retorna a variável booleana "bravo" do objeto
        return bravo;
    }

    public void setAnimal(String nome, boolean bravo) { // método modificador para alterar o nome do new Animal e se é
                                                        // bravo ou não (true or false)
        this.bravo = bravo;
        this.nome = nome;
    }

    public void setBravo(boolean bravo) { // método para modificar a variavel "bravo"
        this.bravo = bravo;
    }

    public void mudarHumor() { // método para modificar o humor do animal. Modifica a variável booleana
                               // "bravo".
        if (bravo == true) {
            setBravo(false);
        } else {
            setBravo(true);
        }
    }

}
