package aula20200915.revisão;

public class Biblioteca extends Prédio {

    private String nome;

    // Construtor padrão (agora EXPLÍCITO)
    public Biblioteca() {
        //Implementamos um construtor padrão EXPLÍCITO para podermos programar dentro dele... :D
        super();
    }

    //Construtor alternativo (vejam que exige um parâmetro, no caso, String nome.)
	public Biblioteca(int quantidadeDeAndares, String nome) {
        //this.quantidadeDeAndares = quantidadeDeAndares;
        //this.setQuantidadeDeAndares(quantidadeDeAndares);
        super(quantidadeDeAndares);
        this.nome = nome;
	}

    @Override
    public void setQuantidadeDeAndares(int quantidadeDeAndares) {
        super.setQuantidadeDeAndares(quantidadeDeAndares+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Biblioteca com nome [" + nome + "]";
    }


 
}
