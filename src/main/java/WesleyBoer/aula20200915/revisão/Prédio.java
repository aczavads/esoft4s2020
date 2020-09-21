package WesleyBoer.aula20200915.revisão;

public class Prédio {
    private int quantidadeDeAndares;

    public Prédio() {
       
    }

    public Prédio(int quantidadeDeAndares) {
        this.quantidadeDeAndares = quantidadeDeAndares;
    }

    public void evacuar() {
        System.out.println("!!!!!!!!!!!!!! corrrrrrrrrrrrrrrrreeee");
    }

    public int getQuantidadeDeAndares() {
        return quantidadeDeAndares;
    }

    public void setQuantidadeDeAndares(int quantidadeDeAndares) {
        this.quantidadeDeAndares = quantidadeDeAndares;
    }
    
}
