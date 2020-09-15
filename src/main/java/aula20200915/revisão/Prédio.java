package aula20200915.revisão;

public class Prédio {
    private int quantidadeDeAndares;

    public Prédio() {
    }

    public Prédio(int quantidadeDeAndares) {
        setQuantidadeDeAndares(quantidadeDeAndares);
    }

    public void evacuar() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!! COOOOOOORRREEEEEEEEEEEEEEE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
    }

    public int getQuantidadeDeAndares() {
        return quantidadeDeAndares;
    }

    public void setQuantidadeDeAndares(int quantidadeDeAndares) {
        if (quantidadeDeAndares < 0) {
            throw new RuntimeException("Andares devem ser positivos!");
        }
        this.quantidadeDeAndares = quantidadeDeAndares;
    }

}
