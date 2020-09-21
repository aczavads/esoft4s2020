package WesleyBoer.aula20200915.revisão;

public class Biblioteca extends Prédio{

    private String nome;

    // Construtor padrão (agora EXPLÍCITO)
    public Biblioteca() {
        // Implementamos um construtor padrão EXPLÍCITO para podermos programar dentro dele...
    }

    // Construtor alternativo (vejam que exige um parâmetro, no caso, String nome.)
	public Biblioteca(int quantidadeDeAndares, String nome) {
        // this.quantidadeDeAndares = quantidadeDeAndares;
        this.setQuantidadeDeAndares(quantidadeDeAndares);
        this.nome = nome;
    }

    @Override
    public void setQuantidadeDeAndares(int quantidadeDeAndares) {
        // TODO Auto-generated method stub
        this.setQuantidadeDeAndares(quantidadeDeAndares+1);
    }
    
    
    // MÉTODO DE ACESSO
    public String getNome() {
        return nome;
    }

    
    // MÉTODO DE MODIFICAÇÃO
    public void setNome(String nome) {
        this.nome = nome;
    }
}
